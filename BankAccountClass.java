class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

public class BankAccountClass {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 1001;
        b.balance = 5000;
        b.deposit(1000);
        b.withdraw(500);
        b.display();
    }
}
