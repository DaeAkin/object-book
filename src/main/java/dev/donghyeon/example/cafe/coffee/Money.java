package dev.donghyeon.example.cafe.coffee;


public class Money {
    public static final Money ZERO = new Money(0);

    private final long mount;

    private Money(long mount) {
        this.mount = mount;
    }

    public static Money won(long mount) {
        return new Money(mount);
    }

    public Money plus(Money money) {
        return new Money(this.mount + money.mount);
    }

    public boolean greaterThan(Money compareMoney) {
        return this.mount >= compareMoney.mount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "mount=" + mount +
                '}';
    }
}
