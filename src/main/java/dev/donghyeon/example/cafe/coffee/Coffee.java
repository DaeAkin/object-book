package dev.donghyeon.example.cafe.coffee;

public class Coffee {

    private String name;

    private Money price = Money.ZERO;

    private CoffeeSize coffeeSize;

    public Coffee(String name, Money price, CoffeeSize coffeeSize) {
        this.name = name;
        this.price = price;
        this.coffeeSize = coffeeSize;
    }

    public Money getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", coffeeSize=" + coffeeSize +
                '}';
    }
}
