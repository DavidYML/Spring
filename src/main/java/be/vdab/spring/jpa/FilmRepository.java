package be.vdab.spring.jpa;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class FilmRepository {

  @PersistenceContext
    private EntityManager em;

    public Film findById (int id) {
        return em.find(Film.class, id);
    }

    public List<Film> findAll(){
        return em.createQuery("select f from Film f", Film.class).getResultList();
    }



    public void save (Film film) {
        em.persist(film);
    }

}
