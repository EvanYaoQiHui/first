package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * author:Evan
 *
 * @date:yyyy/mm/dd
 */
@RestController
public class UserController {
    private User user = new User();
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello %s";

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public User user() {
        return user;
    }

    /**
     * @param name
     * @return the method of greeting is return  json data
     */
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
