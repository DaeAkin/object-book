package dev.donghyeon.example.moive;

import java.time.LocalDateTime;

public class Screen {


    private LocalDateTime whenToStart;
    private Movie movie;
    private int sequence;

    public int getSequence() {
        return sequence;
    }

    public Money getMovePrice() {
        return movie.getPrice();
    }

    public LocalDateTime getWhenToStart() {
        return whenToStart;
    }

    public Movie getMovie() {
        return movie;
    }



    public Reservation reserve() {
        Money fee = movie.calculateFee(this);
        return null;
    }



}
