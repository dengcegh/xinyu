package com.example.listviewtest;

/**
 * Created by Administrator on 2017/1/25.
 */

public class Fruit {

    private String note;
    private String name;
    private int imageId;

    public Fruit(String note, String name, int imageId){

        this.note=note;
        this.name=name;
        this.imageId=imageId;
    }

    public String getNote(){
        return note;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
