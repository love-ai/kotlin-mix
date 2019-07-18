package com.ltz.kotlintest.usejavainkotlin.example1;

public class House {
    private String address;
    private double price;
    private boolean newHouse;

    public House(String address, double price, boolean newHouse) {
        this.address = address;
        this.price = price;
        this.newHouse = newHouse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNewHouse() {
        return newHouse;
    }

    public void setNewHouse(boolean newHouse) {
        this.newHouse = newHouse;
    }
}
