import java.time.LocalDate;

public class Movie {
    public final String movieName;
    public final LocalDate releaseDate;
    public float rating;
    public final String genre;

    // Static fields
    public static int movieCounter = 0;
    public static final int RATING_FOR_OSCAR = 9;

    // Constructor
    public Movie(String movieName, LocalDate releaseDate, float rating, String genre) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.genre = genre;
        movieCounter++;
    }

    // toString method
    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", releaseDate=" + releaseDate +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }
    // Function to reset movieCounter
    public static void resetCounter() {
        movieCounter = 0;
    }

    // Function to check if the movie won an Oscar
    public boolean isWonOscar() {
        return rating >= RATING_FOR_OSCAR;
    }
}