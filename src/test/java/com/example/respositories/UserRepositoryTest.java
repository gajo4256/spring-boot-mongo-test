package com.example.respositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.example.Application;
import com.example.config.FakeMongoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FakeMongoConfig.class, Application.class}, loader = AnnotationConfigContextLoader.class)
public class UserRepositoryTest {

    @Autowired
    private MongoTemplate template;

    @Autowired
    private UserRepository underTest;

    @Test
    public void someTest() throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
