package Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Simple ATM Simulator CLI
 */
public class ATMSimulatorCLI {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<ATMAccount> ACCOUNTS = new ArrayList<>();

    public static void main(String[] args) {
        // pre-create a demo account
        ACCOUNTS.add(new ATMAccount(1234, 500));

        System.out.println("===== ATM Simulator =====");
        while (true) {
            System.out.print("Enter account number (0 to exit): ");
            int accNum = Integer.parseInt(SCANNER.nextLine().trim());
            if (accNum == 0) return;
            ATMAccount acc = findAccount(accNum);
            if (acc == null) { System.out.println("Account not found."); continue; }
            System.out.print("Enter PIN: ");
            int pin = Integer.parseInt(SCANNER.nextLine().trim());
            try {
                if (!acc.authenticate(pin)) throw new InvalidPINException("Wrong PIN");
                session(acc);
            } catch (InvalidPINException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static ATMAccount findAccount(int num) {
        return ACCOUNTS.stream().filter(a -> a.getAccountNumber() == num).findFirst().orElse(null);
    }

    private static void session(ATMAccount acc) {
        while (true) {
            printMenu();
            int choice = readInt("Choose option: ");
            try {
                switch (choice) {
                    case 1 -> System.out.printf("Current balance: %.2f%n", acc.getBalance());
                    case 2 -> {
                        double amt = readDouble("Deposit amount: ");
                        acc.deposit(amt);
                        System.out.println("Deposited.");
                    }
                    case 3 -> {
                        double amt = readDouble("Withdraw amount: ");
                        acc.withdraw(amt);
                        System.out.println("Withdrawn.");
                    }
                    case 4 -> {
                        System.out.println("--- History ---");
                        acc.getHistory().forEach(System.out::println);
                    }
                    case 5 -> {
                        System.out.println("Session ended.\n");
                        return;
                    }
                    default -> System.out.println("Invalid option");
                }
            } catch (InsufficientFundsException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Balance Inquiry");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Print Receipt");
        System.out.println("5. Logout");
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Integer.parseInt(SCANNER.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("Enter integer."); }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Double.parseDouble(SCANNER.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("Enter number."); }
        }
    }
}
