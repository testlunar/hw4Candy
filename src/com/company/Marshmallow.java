package com.company;

public class Marshmallow extends Sweets{
    private String colour;
       public Marshmallow(String name, Double price, Double weight, String colour) {
       super(name, price, weight);
       this.colour=colour;
    }

    @Override
    public String toString() {
        return "Маршмеллоу ["+super.toString()+"; цвет -  "+colour+" ]";
    }
}
