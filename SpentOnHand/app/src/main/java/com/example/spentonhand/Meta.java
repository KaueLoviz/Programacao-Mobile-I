package com.example.spentonhand;

public class Meta {
    private long id;
    //meta à gastar se inicia no zero
    private double meta = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }
}