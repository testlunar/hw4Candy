package com.company;

public class Candy extends Sweets {
    public Candy(){};
    public Candy(String name, Double price, Double weight, String info) {
        super(name, price, weight, info);
    }
    @Override
    public String toString() {
        return "Конфета ["+super.toString()+"]";
    }
}
