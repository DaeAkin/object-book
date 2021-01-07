package dev.donghyeon.example.phone;

import java.time.Duration;

public class RegularPolicy implements RatePolicy{
    private final Money amounts;
    private final Duration seconds;

    public RegularPolicy(Money amounts, Duration seconds) {
        this.amounts = amounts;
        this.seconds = seconds;
    }

    @Override
    public Money calculateFee(Phone phone) {
        Money result = new Money(0);

        for (Call call: phone.getCalls()) {
            result = amounts.times(call.getDuration().getSeconds() / seconds.getSeconds());
        }
        return result;
    }
}
