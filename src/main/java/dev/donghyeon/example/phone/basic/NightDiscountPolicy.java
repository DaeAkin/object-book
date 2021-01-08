package dev.donghyeon.example.phone.basic;

import dev.donghyeon.example.phone.BasicPolicy;
import dev.donghyeon.example.phone.Call;
import dev.donghyeon.example.Money;

import java.time.Duration;

public class NightDiscountPolicy extends BasicPolicy {
    public static final int NIGHT_HOUR = 22;

    private final Money nightAmounts;
    private final Money regularAmounts;
    private final Duration seconds;

    public NightDiscountPolicy(Money nightAmounts, Money regularAmounts, Duration seconds) {
        this.nightAmounts = nightAmounts;
        this.regularAmounts = regularAmounts;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateFee(Call call) {
        if (call.getStart().getHour() >= NIGHT_HOUR) {
            return nightAmounts.times(call.getDuration().getSeconds() / seconds.getSeconds());
        }
        return regularAmounts.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
