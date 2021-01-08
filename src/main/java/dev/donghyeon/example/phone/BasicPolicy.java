package dev.donghyeon.example.phone;

import dev.donghyeon.example.Money;

public abstract class BasicPolicy implements RatePolicy{

    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;

        for (Call call: phone.getCalls()) {
            result = result.plus(calculateFee(call));
        }
        return result;
    }

    protected abstract Money calculateFee(Call call);
}
