package dev.donghyeon.example.phone.basic;

import dev.donghyeon.example.Money;
import dev.donghyeon.example.phone.BasicPolicy;
import dev.donghyeon.example.phone.Call;
import dev.donghyeon.example.phone.DateTimeInterval;
import dev.donghyeon.example.phone.DayOfWeekDiscountRule;

import java.util.ArrayList;
import java.util.List;

//요일별 방식 구현
public class DayOfWeekDiscountPolicy extends BasicPolicy {
    private List<DayOfWeekDiscountRule> rules = new ArrayList<>();

    public DayOfWeekDiscountPolicy(List<DayOfWeekDiscountRule> rules) {
        this.rules = rules;
    }

    @Override
    protected Money calculateFee(Call call) {
        Money result = Money.ZERO;
        for(DateTimeInterval interval : call.getInterval().splitByDay()) {
            for(DayOfWeekDiscountRule rule : rules) {
                result.plus(rule.calculate(interval));
            }
        }
        return null;
    }
}
