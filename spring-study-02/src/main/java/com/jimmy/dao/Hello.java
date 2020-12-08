package com.jimmy.dao;

public class Hello {
    private String str;
    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str = str;
    }
    public Hello(){
        System.out.println("create hello object");
    }

    public Hello(String world){
        str = world;
        System.out.println(world);
    }

    @Override
    public String toString() {
        return "Hello " + str ;
    }
}
