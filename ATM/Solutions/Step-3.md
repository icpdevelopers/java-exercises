# Step 3 - Deposit Function

Now we can add methods for deposit function that increases the amount by the given amount.

```java
public void deposit(double amount) {
    if (amount >=0) {
        this.balance += amount;
    } else {
        System.out.println("Invalid amount. Please enter a positive value.");
    }
}

public double getBalance() {
    return this.balance;
}
```
