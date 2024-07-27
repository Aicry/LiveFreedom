package com.hms.designpatterns.prototype;

/**
 * @ClassName Prototype
 * @Author hms
 * @Date 2024/3/1 20:12
 * @Description TODO
 */
public abstract class Prototype implements Cloneable{

    private String id;


    public Prototype(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public abstract Prototype clone();
}
