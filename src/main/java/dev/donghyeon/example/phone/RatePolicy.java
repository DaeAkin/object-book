package dev.donghyeon.example.phone;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
