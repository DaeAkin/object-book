package dev.donghyeon.example.phone;

import dev.donghyeon.example.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
