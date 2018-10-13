package com.lenistech.lp.service.template_service.config;

import com.github.fakemongo.Fongo;
import com.lenistech.lp.service.template_service.dao.ExampleRepository;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.mock;

@Configuration
public class TestConfiguration {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    MongoClient mongo() {
        return new Fongo("mongo-test").getMongo();
    }

    @Bean
    ExampleRepository lpTemplateRepository() {
        return mock (ExampleRepository.class);
    }

//    @Bean
//    public StaticMethodMatcherPointcutAdvisor mongoDaoSaveAdvisor() {
//        StaticMethodMatcherPointcutAdvisor advisor = new StaticMethodMatcherPointcutAdvisor() {
//            @Override public boolean matches(Method method, Class<?> targetClass) {
//                return true;
//            }
//        };
//        advisor.setClassFilter((cls) -> LPTemplateRepository.class.isAssignableFrom(cls));
//        advisor.setAdvice((MethodBeforeAdvice) (method, args, target)-> {
//            method.invoke(lpTemplateRepository(), args);
//        });
//        return advisor;
//    }

}
