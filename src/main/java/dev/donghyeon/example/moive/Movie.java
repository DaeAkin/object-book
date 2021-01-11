package dev.donghyeon.example.moive;

import java.time.Duration;

public class Movie {

    private String title;
    private Duration runningTime;
    private DiscountPolicy discountPolicy;
    private Money price;

    public Money getPrice() {
        return price;
    }

    public Money calculateFee(Screen screen) {
        return price.minus(discountPolicy.calculateDiscountMoney(screen));
    }


}
