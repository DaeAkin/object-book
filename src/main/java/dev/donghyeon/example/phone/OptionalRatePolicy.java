package dev.donghyeon.example.phone;

import dev.donghyeon.example.Money;

public abstract class OptionalRatePolicy implements RatePolicy{
    private final RatePolicy next;

    public OptionalRatePolicy(RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(Phone phone) {
        return afterCalculateFee(next.calculateFee(phone));
    }

    protected abstract Money afterCalculateFee(Money money);
}
