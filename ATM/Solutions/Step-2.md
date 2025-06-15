# Step 2

In step 2 we can create a constructor for `ATMAccount` class.

```java
public ATMAccount(double initialBalance) {
    this.accountNumber = ATMAccount.NEXT_ACC_NUMBER++;
    this.balance = initialBalance;
}
```