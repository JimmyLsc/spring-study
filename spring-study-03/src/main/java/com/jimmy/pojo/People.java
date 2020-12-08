package com.jimmy.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {
    private Cat cat;
    private Dog dog;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name=" + name +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Resource
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    // Autowired 优先使用ByType匹配
    // Resource 优先使用ByName 匹配
    
}
