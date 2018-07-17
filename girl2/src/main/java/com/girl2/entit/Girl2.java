package com.girl2.entit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Girl2 {

    @Id
    @GeneratedValue
    private Integer id;
    private String girl2C;
    private Integer age;

    public Girl2(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGirl2C() {
        return girl2C;
    }

    public void setGirl2C(String girl2C) {
        this.girl2C = girl2C;
    }

    public Integer getAge(int i) {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
