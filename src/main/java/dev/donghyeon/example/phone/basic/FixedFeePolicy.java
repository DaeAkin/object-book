package dev.donghyeon.example.phone.basic;

import dev.donghyeon.example.phone.BasicPolicy;
import dev.donghyeon.example.phone.Call;
import dev.donghyeon.example.Money;

import java.time.Duration;

public class FixedFeePolicy extends BasicPolicy {
    private final Money amounts;
    private final Duration seconds;

    public FixedFeePolicy(Money amounts, Duration seconds) {
        this.amounts = amounts;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateFee(Call call) {
        return amounts.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
