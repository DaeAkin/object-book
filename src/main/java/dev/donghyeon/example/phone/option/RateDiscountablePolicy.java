package dev.donghyeon.example.phone.option;

import dev.donghyeon.example.Money;
import dev.donghyeon.example.phone.OptionalRatePolicy;
import dev.donghyeon.example.phone.RatePolicy;

public class RateDiscountablePolicy extends OptionalRatePolicy {
    private final Money money;

    public RateDiscountablePolicy(Money money, RatePolicy next) {
        super(next);
        this.money = money;

    }
    @Override
    protected Money afterCalculateFee(Money money) {
        return money.minus(this.money);
    }

}
