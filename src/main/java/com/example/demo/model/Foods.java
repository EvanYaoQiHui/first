package com.example.demo.model;

/**
 * author:Evan
 *
 * @date:2018/7/31
 */
public class Foods {
    /**
     * food id
     */
    private String id;
    /**
     * food name
     */
    private String name;
    private double price;
    private String description;
    /**
     * food picture
     */
    private String icon;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
