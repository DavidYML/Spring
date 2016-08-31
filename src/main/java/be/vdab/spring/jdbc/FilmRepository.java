package be.vdab.spring.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepository {

 @Autowired
    private JdbcTemplate jt;

    public List<Film> findAllFilms(){

       return jt.query("select * from film", (rs, i)-> new Film (



                    rs.getString("title"),
                    rs.getInt("release_year"),
                    rs.getString("description")
            ));






    }
}

