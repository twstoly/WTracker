package models;

import java.sql.Timestamp;

public abstract class Animals{
    public String name;
    public Timestamp createdAt;

    public String getName() {
        return name;
    }
    public Timestamp getCreatedAt(){
        return createdAt;
    }

}