package cucumber.project.film.theather;


import java.util.*;

/**
 * 
 */
public class Reservation {

    /**
     * Default constructor
     */
    public Reservation() {
    }

    
    public String reservation;

    /**
     * 
     */
    public Set<User> users;

    /**
     * 
     */
    public Set<Movie> movies;
    
    
    public String getReservation() {
        // TODO implement here
        return reservation;
    }
    
    public void setReservation(String reservation) {
        // TODO implement here
        this.reservation = reservation;
    }


}