package com.hms.java;

/**
 * @Author Hms
 * @Date 2024/08/28 21:45
 **/
public class Construct {

    private final String a;

    public Construct(String a) {
        this.a = a;
    }
    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Construct construct = new Construct("aaa");
        byte[] allocation1, allocation2;
        allocation1 = new byte[309000*1024];
        allocation2 = new byte[309000*1024];
        construct.print();
    }
}
