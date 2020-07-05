package com.company;

public class Jellybean extends Sweets{
    public Jellybean(String name, Double price, Double weight, String info) {
        super(name, price, weight, info);
    }
    @Override
    public String toString() {
        return "Желе ["+super.toString()+"]";
    }
}
