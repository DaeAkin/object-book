package dev.donghyeon.example.moive;


public class Money {
    public static final Money ZERO = new Money(0);


    private final long mount;

    private Money(long mount) {
        this.mount = mount;
    }

    public static Money won(long mount) {
        return new Money(mount);
    }

    public Money plus(long mount) {
        return new Money(this.mount + mount);
    }
    public Money plus(Money money) {
        return new Money(this.mount + money.mount);
    }

    public Money minus(long mount) {
        return new Money(this.mount - mount);
    }
    public Money minus(Money money) {
        return new Money(this.mount - money.mount);
    }

    public Money times(long mount) {
        return new Money(this.mount * mount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "mount=" + mount +
                '}';
    }
}
