package com.jimmy.student;

public class Address {
    private String addressPlace;

    public String getAddressPlace() {
        return addressPlace;
    }

    public void setAddressPlace(String addressPlace) {
        this.addressPlace = addressPlace;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressPlace='" + addressPlace + '\'' +
                '}';
    }
}
