package dev.donghyeon.example.cafe.coffee;

import java.util.List;

public class Coffees {

    private final List<Coffee> coffees;

    private Coffees(List<Coffee> coffees) {
        this.coffees = coffees;
    }

    public static Coffees from(List<Coffee> coffees) {
        return new Coffees(coffees);
    }

    public Money getTotalPrice() {
        return coffees.stream()
                .map(Coffee::getPrice)
                .reduce(Money.ZERO, Money::plus);
    }

    @Override
    public String toString() {
        return "Coffees{" +
                "coffees=" + coffees +
                '}';
    }
}
