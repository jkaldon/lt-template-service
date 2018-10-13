package com.lenistech.lp.service.template_service.dao;

import com.lenistech.lp.service.template_service.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ExampleRepository extends MongoRepository<Example, String>{
    List<Example> findByName(String name);
}
