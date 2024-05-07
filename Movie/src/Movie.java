public class Movie { private final String title;
    private final int releaseYear;
    private final String genre;
    private double rating;

    // Constructor
    public Movie(String title, int releaseYear, String genre, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }

    // Copy Constructor
    public Movie(Movie other) {
        this.title = other.title;
        this.releaseYear = other.releaseYear;
        this.genre = other.genre;
        this.rating = other.rating;
    }
    // Getter method for rating
    public double getRating() {
        return rating;
    }

    // Setter method for rating
    public void setRating(double rating) {
        this.rating = rating;
    }
    //to string method
    @Override
    public String toString() {
        return "Movie: " +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                ", rating=" +rating;}
}