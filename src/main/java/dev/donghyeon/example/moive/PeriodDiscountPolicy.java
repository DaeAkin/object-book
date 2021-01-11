package dev.donghyeon.example.moive;

import java.time.LocalDateTime;

public class PeriodDiscountPolicy implements DiscountPolicy{
    private LocalDateTime from;
    private LocalDateTime to;

    @Override
    public Money calculateDiscountMoney(Screen screen) {
        return Money.ZERO;
    }
}
