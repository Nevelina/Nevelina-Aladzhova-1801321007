package cucumber.project.film.theather.service;

import java.util.ArrayList;
import java.util.List;

import cucumber.project.film.theather.Movie;
import cucumber.project.film.theather.Reservation;


public class InsertReservation {

	public static String Insert(String movieName,String movieTime,String reservation) {
	
		if(movieName.isEmpty() && movieTime.isEmpty()) {
			return "Invalid data";
		}
		
		
		int reservationNum = Integer.parseInt(reservation);
		int movieTimeNum = Integer.parseInt(movieTime);
		double result = (Math.abs(movieTimeNum) - Math.abs(reservationNum));
		
		
		
		if(reservation.isEmpty()) {
			return "Invalid data";
		}
		
		if(result <= 0.99) {
			return "Invalid reservation time need to be 60 min before film";
		}
		
		List<Movie> movieList = getMovie();
		boolean checkMovie = movieList
				.stream()
				.anyMatch(movie -> movie.getMovie().equals(movieName) && movie.getTime().equals(movieTime));
		

				
		if(checkMovie && result >= 1) {
			return "Success";
		}
				
		return "Invalid film name or time";
	}
	
	public static List<Movie> getMovie(){
		Movie movie = new Movie();
		movie.setMovie("Inception");
		movie.setTime("11");
		List<Movie> movieList = new ArrayList<>();
		movieList.add(movie);
		return movieList;
		
	}
	
	public static List<Reservation> getReservation(){
		Reservation reservation = new Reservation();
		reservation.setReservation("10");	
		List<Reservation> reservationList = new ArrayList<>();
		reservationList.add(reservation);
		return reservationList;
		
	}
}
