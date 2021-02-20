package cucumber.project.film.theather;


import java.util.*;

/**
 * 
 */
public class Movie {

    /**
     * Default constructor
     */
    public Movie() {
    }

    /**
     * 
     */
    private String movie;

    /**
     * 
     */
   
    
    private int movieHall;

    /**
     * 
     */
    private String time;

    /**
     * 
     */
    public Set<MovieTime> cinema;

    /**
     * 
     */
    public Reservation reservations;

    /**
     * @return
     */
    public String getMovie() {
        // TODO implement here
        return movie;
    }

    /**
     * @param movie 
     * @return
     */
    public void setMovie(String movie) {
        // TODO implement here
        this.movie = movie;
    }

    /**
     * @return
     */
    public String getTime() {
        // TODO implement here
        return time;
    }

    /**
     * @param lenght 
     * @return
     */
    public void setTime(String time) {
        // TODO implement here
        this.time = time;
    }

    /**
     * @return
     */
    public int getMovieHall() {
        // TODO implement here
        return 0;
    }

    /**
     * @param movieHall 
     * @return
     */
    public void setMovieHall(int movieHall) {
        // TODO implement here
        this.movieHall = movieHall;
    }

    /**
     * @return
     */
    public MovieTime getTIme() {
        // TODO implement here
        return null;
    }

    /**
     * @param Length 
     * @return
     */
   
}