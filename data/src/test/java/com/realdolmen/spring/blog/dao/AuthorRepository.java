package com.realdolmen.spring.blog.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository <Author,Integer> {
    Author findByFirstName(String firstName);

    List<Author> readByFirstNameOrderByLastNameAsc(String first);


}

