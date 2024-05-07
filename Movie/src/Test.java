import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("Inception", 2010, "Sci-Fi", 8.8);
        Movie movie2 = new Movie("The Dark Knight", 2008, "Action", 9.0);


        movies.add(movie1);
        movies.add(movie2);

        System.out.println("Size of movies list: " + movies.size());

        Movie newMovie = new Movie("Avatar", 2009, "Sci-Fi", 7.8);
        movies.addFirst(newMovie);

        Movie lastMovie = new Movie("Titanic", 1997, "Romance", 7.8);
        movies.add(lastMovie);

        Movie specificMovie = new Movie("Pulp Fiction", 1994, "Crime", 8.9);
        movies.add(2, specificMovie);
        System.out.println("Size of movies list: " + movies.size());



        System.out.println("All movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        movies.remove(specificMovie);
        System.out.println("After removing specific movie:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("**** incrementing rating ****");

        for (Movie movie : movies) {
            movie.setRating(movie.getRating() + 1); // Incrementing rating by 1
            System.out.println(movie);
        }

}
}
