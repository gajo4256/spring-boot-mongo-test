package com.example.config;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = {"com.example.repositories"})
@PropertySources({@PropertySource("classpath:mongo.properties")})
public class MongoConfig extends AbstractMongoConfiguration {

    @Value("${mongo.dbName}")
    private String dbName;

    @Value("${mongo.host}")// ${}
    private String host;

    @Value("${mongo.port}")
    private int port;

    @Override
    protected String getDatabaseName() {
        return dbName;
    }

    @Bean
    @Override
    public MongoClient mongo() throws UnknownHostException {
        return new MongoClient(new ServerAddress(host, port));
    }

//    @Bean
//    public MongoTemplate mongoTemplate() throws UnknownHostException {
//        return new MongoTemplate(mongo(), getDatabaseName());
//    }
}
