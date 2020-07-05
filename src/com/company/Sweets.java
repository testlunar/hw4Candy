package com.company;

public abstract class Sweets {

    private String name;
    private Double price;
    private Double weight;
    private String info;

    public Sweets(){};

    public Sweets(String name, Double price, Double weight, String info) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
   public String toString (){
        return "Название = "+name+"; цена = "+price+"; вес = "+ weight+"; Инфо = "+ info;
    }
}