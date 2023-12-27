import java.util.*;

public class Movie {
    private String title;
    private Set<Actor> actors = new HashSet<>();

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    // Метод для додавання актора до фільму
    public void addActor(Actor actor) {
        actors.add(actor);
    }

    // Задача 4: Підрахунок кількості акторів у фільмі (нетипізований ітератор)
    public int getNumberOfActors() {
        return actors.size();
    }
}
