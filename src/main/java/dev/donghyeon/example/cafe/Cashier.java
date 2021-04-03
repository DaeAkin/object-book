package dev.donghyeon.example.cafe;

import dev.donghyeon.example.cafe.coffee.Coffees;

public class Cashier {

    private Barista barista;

    public Cashier(Barista barista) {
        this.barista = barista;
    }

    public void takeOrder(Coffees coffees) {
        barista.makeCoffees(coffees);
    }
}
