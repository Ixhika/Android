package com.example.mydemo;

import java.io.Serializable;

public class Value implements Serializable {
    private String type;
    private int count;

    public Value(){}

    public Value(String type, int count){
        this.type = type;
        this.count = count;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public int getCount() {

        return count;
    }

    public void setCount(int count) {

        this.count =count;
    }
}
