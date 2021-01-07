package dev.donghyeon.example.phone;

public class Money {

    private final long mount;

    public Money(long mount) {
        this.mount = mount;
    }

    public Money plus(long mount) {
        return new Money(this.mount + mount);
    }

    public Money minus(long mount) {
        return new Money(this.mount - mount);
    }

    public Money times(long mount) {
        return new Money(this.mount * mount);
    }
}
