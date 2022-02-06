package models;

import db.DB;
import db.DatabaseManagement;
import org.sql2o.Connection;

import java.util.List;


public class Animal extends Animals implements DatabaseManagement {

    private int id;


    public Animal(String name) {
        this.name = name;

    }


    @Override
    public boolean equals(Object otherAnimal) {
        if(!(otherAnimal instanceof Animal)) {
            return false;
        } else {
            Animal newAnimal = (Animal) otherAnimal;
            return this.getName().equals(newAnimal.getName());
        }
    }





}