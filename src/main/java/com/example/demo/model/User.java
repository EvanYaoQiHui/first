package com.example.demo.model;

/**
 * author:Evan
 * @date:2018/7/30
 */
public class User {
    /**
     *   user id
     */
    private int id=1;
    /**
     * user name
     */
    private String name="yao";
    private int age=20;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
