package com.example.config;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.example.repositories")
public class FakeMongoConfig extends AbstractMongoConfiguration {


    @Override
    protected String getDatabaseName() {
        return "teamgeist-dev";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Fongo("fongo").getMongo();
    }

}
