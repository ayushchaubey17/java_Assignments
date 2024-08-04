class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private String genre;

    // Default constructor
    public Movie() {
    }

    // Parameterized constructor
    public Movie(String title, String director, int releaseYear, String genre) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }




    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}




public class MovieManager {
    private Movie[] movies;
    private int count;

    public MovieManager(int capacity) {
        movies = new Movie[capacity];
        count = 0;
    }

    public void addMovie(String title, String director, int releaseYear, String genre) {
        if (count < movies.length) {
            movies[count++] = new Movie(title, director, releaseYear, genre);
        } else {
            System.out.println("Array is full. Cannot add more movies.");
        }
    }

    public void displayMovies() {
        if (count == 0) {
            System.out.println("No movies to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i]);
        }
    }

    public static void main(String[] args) {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Bahubali", "Rajamoli", 2017, "Motivation  ");

        System.out.println("Movies added:");
        manager.displayMovies();
    }
}
