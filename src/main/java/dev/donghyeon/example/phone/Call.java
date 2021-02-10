package dev.donghyeon.example.phone;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {

    private final DateTimeInterval interval;

    public Call(LocalDateTime start, LocalDateTime end) {
        this.interval = DateTimeInterval.of(start,end);
    }

    public LocalDateTime getStart() {
        return interval.getFrom();
    }

    public LocalDateTime getEnd() {
        return interval.getTo();
    }

    public Duration getDuration() {
        return interval.duration();
    }

    public List<DateTimeInterval> splitByDay() {
        return interval.splitByDay();
    }
}
