package cucumber.project.film.theather.model;


public class ReservationSreenModel {

	String movie;
	String movieTime;
	String reservation;
	String message;
	
	public void OpenScreen() {
		// TODO Auto-generated method stub
		System.out.println("Потребителя отваря екрана за резервации");
	}

	public void InsertUserData() {
		// TODO Auto-generated method stub
		System.out.println("Потребителя въвежда данните си");
	}

	public void InsertFilmData(String film, String time) {
		// TODO Auto-generated method stub
		this.movie = film;
		movieTime = time;
	}

	public void InsertReservation(String reservationTime) {
		// TODO Auto-generated method stub
		reservation = reservationTime;
		message = cucumber.project.film.theather.service.InsertReservation.Insert(movie, movieTime, reservation);
	}
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
