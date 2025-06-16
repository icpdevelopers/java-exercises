# Step 4 - Withdraw Function

We can create a withdraw function that takes an amount as arguments. This function will check if the amount is less than or equal to the current balance and is greater than zero. If both conditions are met, it will subtract the amount from the balance.

```java
public void withdraw(double amount) {
    if (amount <= 0) {
        System.out.println("Withdrawal amount must be positive.");
    } else if (amount <= balance) {
        balance -= amount;
    } else {
        System.out.println("Insufficient funds.");
    }
}
```
