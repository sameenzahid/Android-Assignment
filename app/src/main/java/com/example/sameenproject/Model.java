package com.example.sameenproject;

public class Model {

    int image;
    String name,history;

    public Model(int image,String name,String history){

        this.image = image;
        this.name = name;
        this.history = history;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
