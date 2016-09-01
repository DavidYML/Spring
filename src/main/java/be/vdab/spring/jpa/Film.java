package be.vdab.spring.jpa;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer id;

// Integer ipv int, want int kan null zijn
    private String title;

    private int releaseYear;

    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "film_id"),
    inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actors= new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Actor> getActors() {
        return actors;
    }
    @Override


    public String toString() {
        return this.title+" ("+ this.releaseYear + ")";
    }
}
