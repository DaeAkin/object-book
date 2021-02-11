package dev.donghyeon.example.phone;



import dev.donghyeon.example.Money;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/*
    요일별 방식 요금제를 구현하기 위한 클래스

    요일의 목록, 단위 시간, 단위 요금의 세가지 요소가 있음.
    월요일부터 금요일까지는 10초당 38원
    토요일과 일요일에는 10초당 19원을 부과하는 식
 */
public class DayOfWeekDiscountRule {
    private List<DayOfWeek> dayOfWeeks = new ArrayList<>();
    private Duration duration = Duration.ZERO;
    private Money amount = Money.ZERO;

    public DayOfWeekDiscountRule(List<DayOfWeek> dayOfWeeks, Duration duration, Money amount) {
        this.dayOfWeeks = dayOfWeeks;
        this.duration = duration;
        this.amount = amount;
    }

    public Money calculate(DateTimeInterval interval) {
         if(dayOfWeeks.contains(interval.getFrom().getDayOfWeek())) {
             return amount.times(interval.duration().getSeconds() / duration.getSeconds());
         }

         return Money.ZERO;
    }



}
