package com.example.courseMania.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // @Entity annotation is used to mark a Java class as an entity, which represents a persistent object that can be mapped to a database table.
public class Course {

    @Id // id is marked as primary key
    private int id;

    private String name;

    private String description;

    private int price;

    public Course() {
    }

    public Course(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
