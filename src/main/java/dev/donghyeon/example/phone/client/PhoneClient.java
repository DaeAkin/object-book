package dev.donghyeon.example.phone.client;

import dev.donghyeon.example.Money;
import dev.donghyeon.example.phone.*;
import dev.donghyeon.example.phone.basic.RegularPolicy;
import dev.donghyeon.example.phone.option.RateDiscountablePolicy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class PhoneClient {

     public static void main(String[] args) {
         final List<Call> calls = Arrays.asList(
                 new Call(LocalDateTime.now(), LocalDateTime.now().plusHours(1))
         );

         Phone regularPhone = new Phone(calls,
                 new RateDiscountablePolicy(Money.won(0),
                         new RegularPolicy(Money.won(50),Duration.ofMinutes(1))));

         final Money money = regularPhone.calculateFee();

         System.out.println(money.toString());
     }
}
