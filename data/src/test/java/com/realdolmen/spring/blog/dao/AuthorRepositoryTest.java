package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by cda5732 on 14/04/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfig.class)
// TODO Activate the test profile
// TODO Activate transactions
public class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository ar;

@Test
    public void testThatAddingAuthorsWork (){


    }

    // TODO wire in the repository

    // TODO add unit tests to test the repository


}
