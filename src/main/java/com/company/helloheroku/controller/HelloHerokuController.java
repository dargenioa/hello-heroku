package com.company.helloheroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHerokuController {

        @GetMapping(value = "/hello")
        @ResponseStatus(value = HttpStatus.OK)
        public String sayHello() {
            String hello = "Hello, Heroku";

            return hello;
        }

        @GetMapping(value = "/hi/{someName}")
        @ResponseStatus(value = HttpStatus.OK)
        public String sayHelloSomeName(@PathVariable String someName) {
            String hello = "Hello, " + someName;

            return hello;
        }
}
