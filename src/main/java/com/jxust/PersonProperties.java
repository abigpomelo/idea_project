package com.jxust;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component

@ConfigurationProperties(prefix = "person")
public class PersonProperties  {
    private String name;
    private String age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return age;
    }

}
