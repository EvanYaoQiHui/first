package com.example.demo.model;

import java.util.List;

/**
 * @author:Evan
 * @date:2018/7/31
 */
public class Order {
    /**
     * order name
     */
    private String name;
    /**
     * Order type
     */
    private String type;
    /**
     * food list
     */
    private List<Foods> foods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Foods> getFoods() {
        return foods;
    }

    public void setFoods(List<Foods> foods) {
        this.foods = foods;
    }
}
