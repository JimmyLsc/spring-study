package com.jimmy.demo;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        RentProxy rentProxy = new RentProxy(host);
        System.out.println();

    }
}
