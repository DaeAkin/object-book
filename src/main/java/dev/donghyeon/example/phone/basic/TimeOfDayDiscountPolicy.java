package dev.donghyeon.example.phone.basic;

import dev.donghyeon.example.Money;
import dev.donghyeon.example.phone.BasicPolicy;
import dev.donghyeon.example.phone.Call;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TimeOfDayDiscountPolicy extends BasicPolicy {
    private List<LocalTime> starts = new ArrayList<>();
    private List<LocalTime> ends = new ArrayList<>();
    private List<Duration> durations = new ArrayList<>();
    private List<Money> amounts = new ArrayList<>();


    @Override
    protected Money calculateFee(Call call) {
        Money result = Money.ZERO;

        return null;
    }
}
