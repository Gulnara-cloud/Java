package week5.examples.abstract_classes.bank;

public class Bank {
    private Account[] accounts;

    Bank() {
        this.accounts = new Account[]{};
    }

    void addAccount(Account account) {
        Account[] newAccounts = new Account[accounts.length + 1];
        for (int i = 0; i < this.accounts.length; ++i) {
            newAccounts[i] = this.accounts[i];
        }
        newAccounts[newAccounts.length - 1] = account;
        this.accounts = newAccounts;
    }

    int totalAmount() {
        int amount = 0;
        for (int i = 0; i < this.accounts.length; ++i) {
            amount += this.accounts[i].getCurrentAmount();
        }
        return amount;
    }
}

