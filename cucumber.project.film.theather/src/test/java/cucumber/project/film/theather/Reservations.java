package cucumber.project.film.theather;


import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.project.film.theather.model.ReservationSreenModel;

public class Reservations {
	
	ReservationSreenModel reservationScreenModel = new ReservationSreenModel();
	

	
	@Given("^Потребителя отваря екрана за резервации$")
	public void userHome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reservationScreenModel.OpenScreen();
	}

	@When("^Потребителя въвежда данните си$")
	public void userData() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    reservationScreenModel.InsertUserData();
	}

	@When("^Избира филм \"([^\"]*)\" , \"([^\"]*)\"$")
	public void chosingFilm(String film, String time) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reservationScreenModel.InsertFilmData(film,time);
	}

	@When("^Прави резервацията в \"([^\"]*)\"$")
	public void enteringReservation(String reservationTime) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reservationScreenModel.InsertReservation(reservationTime);
	}

	@Then("^Виждаме съобщение \"([^\"]*)\"$")
	public void getMessage(String message) throws Throwable {
		String returnMsg = reservationScreenModel.getMessage();
		assertEquals(message, returnMsg);
	}
}
