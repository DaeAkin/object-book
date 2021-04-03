package dev.donghyeon.example.cafe;

import dev.donghyeon.example.cafe.coffee.Coffees;
import dev.donghyeon.example.cafe.coffee.Money;

public class Customer {

    private Money money;

    public Customer(Money money) {
        this.money = money;
    }

    public void order(Cashier cashier, Coffees coffees) {
        if(isMoneyEnough(coffees))
            throw new RuntimeException("돈이 부족합니다.");
        cashier.takeOrder(coffees);
    }

    private boolean isMoneyEnough(Coffees coffees) {
        Money totalPrice = coffees.getTotalPrice();
        return money.greaterThan(totalPrice);
    }
}
