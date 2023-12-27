import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getActors() {
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
