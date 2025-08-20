package week4.bank;

import org.w3c.dom.ls.LSOutput;

public class CheckingAccount {
    // Encapsulation, hide the balance from external access
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

