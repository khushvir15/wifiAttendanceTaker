package com.example.wi_fiattendance;

public class Model {
    String Name;
    String ID;
    String image;

    public Model() {
    }

    public Model(String name, String ID, String image) {
        Name = name;
        this.ID = ID;
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
