package com.jxust.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String age;

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return age;
    }
}
