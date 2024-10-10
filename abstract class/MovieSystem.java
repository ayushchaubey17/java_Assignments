// Abstract class Movie
abstract class Movie {
    protected String title;
    protected String director;
    protected int duration; // duration in minutes

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    // Abstract method to get genre
    public abstract String getGenre();

    // Abstract method to get rating
    public abstract double getRating();

    // Abstract method to get description
    public abstract String getDescription();

    // Method to display movie details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + getGenre());
        System.out.println("Rating: " + getRating());
        System.out.println("Description: " + getDescription());
        System.out.println();
    }
}

// Subclass for Action Movies
class ActionMovie extends Movie {
    private double rating;

    public ActionMovie(String title, String director, int duration, double rating) {
        super(title, director, duration);
        this.rating = rating;
    }

    @Override
    public String getGenre() {
        return "Action";
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public String getDescription() {
        return "An action-packed movie full of thrills and excitement.";
    }
}

// Subclass for Comedy Movies
class ComedyMovie extends Movie {
    private double rating;

    public ComedyMovie(String title, String director, int duration, double rating) {
        super(title, director, duration);
        this.rating = rating;
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public String getDescription() {
        return "A hilarious movie that will make you laugh out loud.";
    }
}

// Main class to demonstrate functionality
public class MovieSystem {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new ActionMovie("Mad Max: Fury Road", "George Miller", 120, 8.1);
        movies[1] = new ComedyMovie("The Hangover", "Todd Phillips", 100, 7.7);
        movies[2] = new ActionMovie("John Wick", "Chad Stahelski", 101, 7.4);

        // Display details of all movies
        for (Movie movie : movies) {
            movie.displayDetails();
        }
    }
}
