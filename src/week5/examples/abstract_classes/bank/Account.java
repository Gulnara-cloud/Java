package week5.examples.abstract_classes.bank;

public abstract class Account {
    protected int amount;

    Account(int amount) {
        this.amount = amount;
    }

    abstract void withdraw(int amount);
    abstract void deposit(int amount);

    int getCurrentAmount() {
        return amount;
    }
}
