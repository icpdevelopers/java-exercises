# Step 6 - ATM Simulation

Now that we have created a basic functionality of the ATM we can now begin to simulate the experience we get when using a real ATM like where we can repeatedly do the task of withdrawing and depositing money.

We can create another class to act as a entry point for our ATM and add a main method to test our ATM class.

```java
public static void main(String[] args) {
  ATM atm = new ATM();
  Scanner scanner = new Scanner(System.in);

  while (true) {
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Display Balance");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();
  }
}
```

This function will display the menu when we run the program.
