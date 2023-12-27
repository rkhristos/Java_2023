import java.util.*;

public class Actor {
    private String name;
    private Set<Movie> movies = new HashSet<>();

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    // Метод для додавання фільму, в якому грав актор
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Задача 5: Список фільмів, в яких зіграв актор (типізований ітератор)
    public Set<Movie> getMoviesSet() {
        return movies;
    }

    // Задача 2 (доповнена): Список акторів, з якими коли-небудь в одному фільмі грав заданий актор (типізований ітератор)
    public Set<Actor> getCoActorsInMovies() {
        Set<Actor> coActors = new HashSet<>();
        for (Movie movie : movies) {
            coActors.addAll(movie.getActors());
        }
        coActors.remove(this);  // Видалення самого актора
        return coActors;
    }
}
