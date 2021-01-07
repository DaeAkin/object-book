package dev.donghyeon.example.phone;

import java.time.Duration;
import java.time.LocalDateTime;

public class Call {

    private final LocalDateTime start;
    private final LocalDateTime end;

    public Call(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public Duration getDuration() {
        return Duration.between(start,end);
    }
}
