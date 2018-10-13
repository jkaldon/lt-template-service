package com.lenistech.lp.service.template_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("LP Template Service")
                .description("LocisPoints Template Service - to be cloned when creating a new service.")
                .version("1")
                .license("All Rights Reserved")
                .licenseUrl("http://www.lenistech.com/license")
                .termsOfServiceUrl("http://www.lenistech.com/tos")
                .contact(new Contact("Joshua Kaldon", "", "jkaldon@lenistech.com"))
                .build();
    }
}
