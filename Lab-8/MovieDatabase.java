import java.util.*;

public class MovieDatabase {
    private Set<Movie> movies = new HashSet<>();
    private Set<Actor> actors = new HashSet<>();
    private Map<Movie, Set<Actor>> movieActorMap = new HashMap<>();

    public Set<Movie> getMovies() {
        return movies;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    // Метод для заповнення бази даних
    public void populateDatabase() {
        // Реалізація заповнення бази даних (додавання фільмів та акторів)
        // ...
    }

    // Задача 1: Визначити, чи є актор, який не зіграв в жодному фільмі (типізований цикл «for-each»)
    public boolean hasActorWithoutMovies() {
        for (Actor actor : actors) {
            if (movieActorMap.values().stream().noneMatch(set -> set.contains(actor))) {
                return true;
            }
        }
        return false;
    }

    // Задача 2: Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор (нетипізований ітератор)
    public Set<Actor> getCoActorsInMovies(Actor actor) {
        Set<Actor> coActors = new HashSet<>();
        for (Movie movie : actor.getMovies()) {
            coActors.addAll(movieActorMap.getOrDefault(movie, Collections.emptySet()));
        }
        coActors.remove(actor);  // Видалення самого актора
        return coActors;
    }

    // Задача 3: Знайти фільм з найбільшою кількістю акторів (типізований ітератор)
    public Movie getMovieWithMostActors() {
        return Collections.max(movies, Comparator.comparingInt(movie -> movieActorMap.getOrDefault(movie, Collections.emptySet()).size()));
    }

    // Додаткова функціональність: Додати фільм та його акторів до бази даних
    public void addMovieWithActors(Movie movie, Set<Actor> actors) {
        movies.add(movie);
        for (Actor actor : actors) {
            this.actors.add(actor);
            movieActorMap.computeIfAbsent(movie, k -> new HashSet<>()).add(actor);
        }
    }
}
