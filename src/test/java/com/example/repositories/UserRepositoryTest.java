package com.example.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.config.FakeMongoConfig;
import com.example.models.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FakeMongoConfig.class)
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
