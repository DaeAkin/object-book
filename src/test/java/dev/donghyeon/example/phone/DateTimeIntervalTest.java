package dev.donghyeon.example.phone;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeIntervalTest {

    @Test
    public void days_test() {
        LocalDate from = LocalDate.of(2021,2,1);
        LocalDate to = LocalDate.of(2021,2,1);

        final Period between = Period.between(from, to);
        System.out.println("days : " + between.getDays());
    }

}
