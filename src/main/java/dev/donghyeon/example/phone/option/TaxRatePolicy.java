package dev.donghyeon.example.phone.option;

import dev.donghyeon.example.Money;
import dev.donghyeon.example.phone.OptionalRatePolicy;
import dev.donghyeon.example.phone.RatePolicy;

public class TaxRatePolicy extends OptionalRatePolicy {
    private final int taxRatio;

    public TaxRatePolicy(int taxRatio, RatePolicy next) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculateFee(Money money) {
        return money.plus(money.times(taxRatio));
    }
}
