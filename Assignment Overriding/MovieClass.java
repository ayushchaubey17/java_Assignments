 class Movie {
    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }


    public void play() {
        System.out.println("now playing the movie: " + title);
    }
}

 class RomComMovie extends Movie {
    public RomComMovie(String title, String director) {
        super(title, director);
    }

    @Override
    public void play() {
        System.out.println("Playing a romantic comedy movie: " + getTitle() +" is directed by"+ getDirector());
    }
}

 class ThrillerMovie extends Movie {
    public ThrillerMovie(String title, String director) {
        super(title, director);
    }

    @Override
    public void play() {
        System.out.println("Playing a thrilling movie: " + getTitle()+" directed by "+getDirector());
    }
}

public class MovieClass {
    public static void main(String[] args) {
        Movie romCom = new RomComMovie("makhi", "ss rajamoli");
        Movie thriller = new ThrillerMovie("bahubali", "ss rajamoli");

        romCom.play();
        thriller.play();
    }
}
