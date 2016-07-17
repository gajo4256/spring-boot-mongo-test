package com.example.repositories;

import com.example.config.FakeMongoConfig;
import com.example.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FakeMongoConfig.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;

    @Test
    public void saveRepoExampleTest() throws Exception {

        final User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");

        underTest.save(user);

        // as of spring boot 1.4 AssertJ library is present
        assertThat(user).isEqualTo(underTest.findOne(user.getId()));

    }


}
