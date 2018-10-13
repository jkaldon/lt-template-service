package com.lenistech.lp.service.template_service.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    private String replicaSet;
    private String username;
    private String password;

//    @Bean
//    public MongoTemplate mongoTemplate(MappingMongoConverter mappingMongoConverter) {
//        MongoClientURI mongoClientURI = mongoClientURI();
//        MongoDbFactory dbFactory = new SimpleMongoDbFactory(this.mongoClient(mongoClientURI), mongoClientURI.getDatabase());
//        MongoTemplate mongoTemplate = new MongoTemplate(dbFactory, mappingMongoConverter);
//        mongoTemplate.indexOps(LPTemplate.class).ensureIndex(new Index().on("serviceName", Sort.Direction.ASC));
//        return mongoTemplate;
//    }



}
