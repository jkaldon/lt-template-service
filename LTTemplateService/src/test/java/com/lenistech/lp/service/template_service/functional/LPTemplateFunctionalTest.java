package com.lenistech.lp.service.template_service.functional;

import com.lenistech.lp.service.template_service.Application;
import com.lenistech.lp.service.template_service.config.TestConfiguration;
import com.lenistech.lp.service.template_service.dao.ExampleRepository;
import com.lenistech.lp.service.template_service.domain.Example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = {Application.class, TestConfiguration.class}
)
public class LPTemplateFunctionalTest {

    @Autowired
    private ExampleRepository lpTemplateRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @LocalServerPort
    int randomServerPort;

    private String baseServiceUrl;

    @Before
    public void init() {
        lpTemplateRepository.deleteAll();
        baseServiceUrl = "http://localhost:" + randomServerPort + "/api/v1";
    }

    @Test
    public void givenHelloWorld_whenNameNotPresent_thenDefaultsToBillyBob() {
        Example expected = new Example("Billy Bob");
        Example actual = restTemplate.getForObject(baseServiceUrl + "/helloworld", Example.class);

        assertEquals(expected, actual);
    }

    @Test
    public void givenHelloWorld_whenNameSpecified_thenReturnsProperName() {
        Example expected = new Example("Jenelle");
        Example actual = restTemplate.getForObject(baseServiceUrl + "/helloworld?name=Jenelle", Example.class);

        assertEquals(expected, actual);
    }
}
