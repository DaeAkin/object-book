package dev.donghyeon.example.cafe;

import dev.donghyeon.example.cafe.coffee.Coffees;

public class Barista {

    public void makeCoffees(Coffees coffees) {
        System.out.println("커피 완료");
        System.out.println(coffees);
    }
}
