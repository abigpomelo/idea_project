package com.jxust.controller;


import com.jxust.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private PersonProperties personProperties;

    @RequestMapping(value = "/s/hello", method = RequestMethod.GET)
    public String say(){
        return personProperties.getName() + "今年： " + personProperties.getAge();
    }

}
