package com.example.demo11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    VersionProperty v;

    @RequestMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello, World!";
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @RequestMapping(value = "/update/{id}", method = { RequestMethod.PATCH })
    public String updateData(@PathVariable(value = "id") String id) {
        return "The data get to update ID = " + id + ".";
    }

    @RequestMapping("/version")
    public VersionProperty getVersion() {
        return v;
    }

}