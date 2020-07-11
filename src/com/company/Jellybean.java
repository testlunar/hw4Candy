package com.company;

public class Jellybean extends Sweets{
    private String type;

    public Jellybean(String name, Double price, Double weight, String type) {
        super(name, price, weight);
        this.type= type;
    }
    @Override
    public String toString() {
        return "Желе ["+super.toString()+"; тип желе -  "+type.toString()+" ]";
    }
}
