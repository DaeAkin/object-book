package dev.donghyeon.example.phone;

import dev.donghyeon.example.Money;

import java.util.Collections;
import java.util.List;


public class Phone {
    private final List<Call> calls;
    private final RatePolicy ratePolicy;

    public Phone(List<Call> calls, RatePolicy ratePolicy) {
        this.calls = calls;
        this.ratePolicy = ratePolicy;
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }
}
