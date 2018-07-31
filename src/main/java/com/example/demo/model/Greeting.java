package com.example.demo.model;

/**
 * author:Evan
 *
 * @date:yyyy/mm/dd
 */
public class Greeting {
    private String name;
    private  long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }
    public void setAge(long age) {
        this.age = age;
    }

    public Greeting(long age, String name) {
        this.age=age;
        this.name = name;
    }
}
