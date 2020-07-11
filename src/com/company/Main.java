package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        selectsweets();

    }

    private static void selectsweets() throws IOException {
        ArrayList<Sweets> box = new ArrayList<>();
        boolean finished = false;
        Double totalPrice = 0.0;
        Double totalWeight = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Напишите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.println("1 - конфета \"Батончик\"");
        System.out.println("2 - конфета \"Лебедь\"");
        System.out.println("3 - маршмеллоу розовый");
        System.out.println("4 - маршмеллоу белый");
        System.out.println("5 - желе \"Шарики\"");
        System.out.println("6 - закончить выбор");

        while (!finished) {
            String choice = reader.readLine();
            switch (choice) {
                case "1":
                    Candy candy1 = new Candy("Баточник", 50.99, 10.4, "Большая");
                    box.add(candy1);
                    totalPrice += candy1.getPrice();
                    totalWeight += candy1.getWeight();
                    System.out.println("конфета \"Батончик\" добавлена в подарок");
                    break;
                case "2":
                    Candy candy2 = new Candy("Лебедь", 15.99, 5.5, "Маленький");
                    box.add(candy2);
                    totalPrice += candy2.getPrice();
                    totalWeight += candy2.getWeight();
                    System.out.println("конфета \"Лебедь\" добавлена в подарок");
                    break;
                case "3":
                    Marshmallow marshmallow1 = new Marshmallow("Маршмеллоу", 15.0, 3.0, "розовый");
                    box.add(marshmallow1);
                    totalPrice += marshmallow1.getPrice();
                    totalWeight += marshmallow1.getWeight();
                    System.out.println("Маршмеллоу розовый добавлен в подарок");
                    break;
                case "4":
                    Marshmallow marshmallow2 = new Marshmallow("Маршмеллоу", 15.0, 3.0, "белый");
                    box.add(marshmallow2);
                    totalPrice += marshmallow2.getPrice();
                    totalWeight += marshmallow2.getWeight();
                    System.out.println("Маршмеллоу белый добавлен в подарок");
                    break;
                case "5":
                    Jellybean jellybean1 = new Jellybean("Шарики", 5.0, 4.3, "разноцветное желе");
                    box.add(jellybean1);
                    totalPrice += jellybean1.getPrice();
                    totalWeight += jellybean1.getWeight();
                    System.out.println("Желе \"Шарики\" добавлен в подарок");
                    break;

                case "6":
                    finished = true;
                    break;
            }
        }
        int count = 0;

        System.out.println("\nПодарок состоит из:");

        for (Sweets allsweet : box) {
            count++;
            System.out.println(count + ". " + allsweet.getName());
            System.out.println(allsweet.toString());
        }
        System.out.printf("\nОбщая цена подарка (руб): " + "%.1f", totalPrice);
        System.out.printf("\nОбщий вес подарка (гр.): " + "%.1f", totalWeight);
    }
}




