package week5.examples.abstract_classes.bank;

public class CheckingAccount extends Account {
    CheckingAccount(int amount) {
        super(amount);
    }
    @Override
    void withdraw(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        }
    }

    @Override
    void deposit(int amount) {
        this.amount += amount;
    }
}
