package com.github.tuomin35.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping(value = "/hello",
                    method = RequestMethod.GET,
                    produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return "Hello world!";
    }

}