# Step 7 - Menu Handler

We can create a menu handler function that will display the menu and handle the user's choice. This function will call the appropriate function based on the user's choice.

```java
public void menuHandler() {
  ATMAccount atm = new ATMAccount(1234,1000); // we can pass the pin number for the ATM account and the initial balance
  Scanner scanner = new Scanner(System.in);

  while (true) {
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Display Balance");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        atm.withdraw(withdrawAmount);
        break;
      case 2:
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        atm.deposit(depositAmount);
        break;
      case 3:
        atm.displayBalance();
        break;
      case 4:
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
      default:
        System.out.println("Invalid choice. Please try again.");
    }
  }
}
```