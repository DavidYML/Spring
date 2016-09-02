package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by cda5732 on 14/04/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfig.class)
// TODO Activate the test profile
// TODO Activate transactions

@ActiveProfiles("test")
@Transactional

public class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository ar;

@Test
    public void testThatAddingAuthorsWork (){


    ar.save(new Author("Jimi", "Sanchez", "password"));
    ar.save(new Author("Jimi", "Hendrix", "password"));
    ar.save(new Author("Janis", "Joplin", "password"));

    Author author = new Author("Jamie", "Lannister", "password");
    ar.save(author);


    assertEquals("Jamie", author.getFirstName());
    assertNotNull(author.getId());
    assertNotNull(String.valueOf(author),getClass());
    ar.readByFirstNameOrderByLastNameAsc(String.valueOf(author));



    List<Author> authors = ar.readByFirstNameOrderByLastNameAsc("Jimi");
    assertEquals(2, authors.size());
    assertEquals("Hendrix", authors.get(0).getLastName());
    assertEquals("Sanchez", authors.get(1).getLastName());

    for (Author la : authors) {
        System.out.println(la.getFirstName() +  " " + la.getLastName());
    }


    }

    // TODO wire in the repository

    // TODO add unit tests to test the repository


}
