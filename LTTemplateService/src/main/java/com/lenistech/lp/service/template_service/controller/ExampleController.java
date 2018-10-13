package com.lenistech.lp.service.template_service.controller;

import com.lenistech.lp.service.template_service.domain.*;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Template Service Example Controller")
public class ExampleController {
    @RequestMapping(value = "/api/v1/helloworld", method = RequestMethod.GET)
    public Example getLPTemplate(@RequestParam(value="name", defaultValue="Billy Bob") String name) {
        return new Example(name);
    }
}
