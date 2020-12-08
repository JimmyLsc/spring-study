package com.jimmy.demo;

public class RentProxy implements Rent{
    private Host host;

    public RentProxy(Host host) {
        this.host = host;
    }
    public RentProxy(){

    }

    public void rent() {
        System.out.println("中介：");
        host.rent();
    }
}
