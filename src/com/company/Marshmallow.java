package com.company;

public class Marshmallow extends Sweets{

    public Marshmallow(String name, Double price, Double weight, String info) {
        super(name, price, weight, info);
    }

    @Override
    public String toString() {
        return "Маршмеллоу ["+super.toString()+"]";
    }
}
