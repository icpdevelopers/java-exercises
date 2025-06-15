package Reference;
import java.util.ArrayList;
import java.util.List;

/**
 * Bank account for ATM simulation.
 */
public class ATMAccount {
    private static int NEXT_ACC_NUMBER = 10001;

    private final int accountNumber;
    private final int pin;
    private double balance;
    private final List<String> history = new ArrayList<>();

    public ATMAccount(int pin, double initialBalance) {
        if (pin < 1000 || pin > 9999) throw new IllegalArgumentException("PIN must be 4 digits");
        if (initialBalance < 0) throw new IllegalArgumentException("Initial balance cannot be negative");
        this.accountNumber = NEXT_ACC_NUMBER++;
        this.pin = pin;
        this.balance = initialBalance;
        history.add(String.format("Account created with balance %.2f", initialBalance));
    }

    public int getAccountNumber() { return accountNumber; }

    public boolean authenticate(int pin) { return this.pin == pin; }

    public double getBalance() { return balance; }

    public void deposit(double amt) {
        if (amt <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amt;
        history.add(String.format("Deposit %.2f | New balance %.2f", amt, balance));
    }

    public void withdraw(double amt) throws InsufficientFundsException {
        if (amt <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
        if (amt > balance) throw new InsufficientFundsException("Insufficient funds");
        balance -= amt;
        history.add(String.format("Withdraw %.2f | New balance %.2f", amt, balance));
    }

    public List<String> getHistory() { return history; }

    @Override
    public String toString() {
        return String.format("#%d | Balance: %.2f", accountNumber, balance);
    }
}

class InsufficientFundsException extends Exception { public InsufficientFundsException(String m){super(m);} }

class InvalidPINException extends Exception { public InvalidPINException(String m){super(m);} }
