package dev.donghyeon.example.cafe;

import dev.donghyeon.example.cafe.coffee.Coffee;
import dev.donghyeon.example.cafe.coffee.CoffeeSize;
import dev.donghyeon.example.cafe.coffee.Coffees;
import dev.donghyeon.example.cafe.coffee.Money;

import java.util.List;

public class Cafe {
     public static void main(String[] args) {
         Barista barista = new Barista();
         Cashier cashier = new Cashier(barista);

         Customer donghyeon = new Customer(Money.won(5000L));

         Coffees coffees = Coffees.from(List.of(
                 new Coffee("아메리카노", Money.won(5000L), CoffeeSize.LARGE)
         ));

         donghyeon.order(cashier,coffees);

      }
}
