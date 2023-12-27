import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    private List<Movie> movies = new ArrayList<>();
    private List<Actor> actors = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Actor> getActors() {
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
            if (actor.getMovies().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    // Задача 2: Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор (нетипізований ітератор)
    public List<Actor> getCoActorsInMovies(Actor actor) {
        List<Actor> coActors = new ArrayList<>();
        for (Movie movie : actor.getMovies()) {
            for (Actor coActor : movie.getActors()) {
                if (!coActors.contains(coActor) && !coActor.equals(actor)) {
                    coActors.add(coActor);
                }
            }
        }
        return coActors;
    }

    // Задача 3: Знайти фільм з найбільшою кількістю акторів (типізований ітератор)
    public Movie getMovieWithMostActors() {
        int maxActors = 0;
        Movie movieWithMostActors = null;

        for (Movie movie : movies) {
            int numberOfActors = movie.getActors().size();
            if (numberOfActors > maxActors) {
                maxActors = numberOfActors;
                movieWithMostActors = movie;
            }
        }

        return movieWithMostActors;
    }
}
