package com.girl2.controller;

import com.girl2.dao.Girl2Repository;
import com.girl2.entit.Girl2;
import com.girl2.service.Girl2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Girl2Controller
{
    @Autowired
    Girl2Repository girl2Repository;
    @Autowired
    Girl2Service girl2Service;

    @GetMapping(value = "/girl2")
    private List<Girl2> getAll(){
        return girl2Repository.findAll();
    }

    @GetMapping(value = "/id/{id}")
    private Optional<Girl2> getById(@PathVariable("id") Integer id){
        return girl2Repository.findById(id);
    }

    @PutMapping(value = "/id/{id}")
    private Girl2 putData(@PathVariable("id") Integer id,
                          @RequestParam("age") Integer age,
                          @RequestParam("girl2C") String girl2C){
        Girl2 girl2 = new Girl2();
        girl2.setId(id);
        girl2.setAge(age);
        girl2.setGirl2C(girl2C);
        return girl2Repository.save(girl2);
    }

    @PostMapping(value = "/girl2")
    private Girl2 addGirl2(@RequestParam("age") Integer age,
                           @RequestParam("girl2C") String girl2C){
        Girl2 girl2 = new Girl2();
        girl2.setAge(age);
        girl2.setGirl2C(girl2C);

        return girl2Repository.save(girl2);
    }

    @PostMapping(value = "/girl2/test")
    private void addTest(){
        girl2Service.insertTest();
    }

    @GetMapping(value = "age/{age}")
    private List<Girl2> listAge(@PathVariable("age") Integer age){
        return girl2Repository.findByAge(age);
    }

}
