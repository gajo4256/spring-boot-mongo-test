package com.example.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.example.Application;
import com.example.config.FakeMongoConfig;
import com.example.models.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FakeMongoConfig.class, Application.class}, loader = AnnotationConfigContextLoader.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;

    @Test
    public void saveRepoExampleTest() throws Exception {

        final User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");

        underTest.save(user);

        assertEquals(user, underTest.findOne(user.getId()));


    }


}
