package dev.donghyeon.example.phone;

import java.time.Duration;

public class NightDiscountPolicy implements RatePolicy {
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
    public Money calculateFee(Phone phone) {
        Money result = new Money(0);

        for (Call call : phone.getCalls()) {
            if (call.getStart().getHour() >= NIGHT_HOUR){
                result = nightAmounts.times(call.getDuration().getSeconds() / seconds.getSeconds());
            }



        }
    }
