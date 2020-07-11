package com.company;

public class Candy extends Sweets {
     private String size;
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public Candy(String name, Double price, Double weight, String size){
        super(name, price, weight);
        this.size=size;
    }
    @Override
    public String toString() {
        return "Конфета ["+super.toString()+"; размер -  "+size+" ]";
    }
}
