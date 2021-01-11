package dev.donghyeon.example.moive;

public class SequenceDiscountPolicy implements DiscountPolicy {

    private int sequence;
    private Money discountMount;

    @Override
    public Money calculateDiscountMoney(Screen screen) {
        if (isDiscountAble(screen))
            return discountMount;
        return Money.ZERO;
    }

    private boolean isDiscountAble(Screen screen) {
        return screen.getSequence() == sequence;
    }
}
