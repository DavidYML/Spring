package be.vdab.spring.jdbc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(Main.class);

        FilmRepository r = context.getBean(FilmRepository.class);

        List<Film> films = r.findAllFilms();
        for (Film film : films) {
            System.out.println(film);
        }



    }
@Bean
    public DriverManagerDataSource dataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("com.mysql.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/sakila");
    ds.setUsername("root");
    ds.setPassword("root");
    return ds;

}

}
