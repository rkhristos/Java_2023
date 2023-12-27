import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name;
    private List<Movie> movies = new ArrayList<>();

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    // Метод для додавання фільму, в якому грав актор
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Задача 5: Список фільмів, в яких зіграв актор (типізований ітератор)
    public List<Movie> getMoviesList() {
        return movies;
    }

    // Задача 2 (доповнена): Список акторів, з якими коли-небудь в одному фільмі грав заданий актор (типізований ітератор)
    public List<Actor> getCoActorsInMovies() {
        List<Actor> coActors = new ArrayList<>();
        for (Movie movie : movies) {
            for (Actor coActor : movie.getActors()) {
                if (!coActors.contains(coActor) && !coActor.equals(this)) {
                    coActors.add(coActor);
                }
            }
        }
        return coActors;
    }
}
