package dev.donghyeon.example.phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Phone {
    List<Call> calls = new ArrayList<>();


    public Money calculateFee() {
        return new Money(0);
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }
}
