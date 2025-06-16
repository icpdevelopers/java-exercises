public class ATM {

    private int accountNumber;
    private double balance;
    private int pinNumber;

    public ATM(double initialBalance, int pinNumber) {
        this.accountNumber = 10001;
        this.balance = initialBalance;
        this.pinNumber = pinNumber;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
    if (amount <= 0) {
        System.out.println("Withdrawal amount must be positive.");
    } else if (amount <= balance) {
        balance -= amount;
    } else {
        System.out.println("Insufficient funds.");
    }
}

    public void displayBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}
