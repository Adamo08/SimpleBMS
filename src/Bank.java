import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private ArrayList<Account> accounts;
    private Scanner scanner = new Scanner(System.in);

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    // Adding new account
    public void addAccount() {
        System.out.println("Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.println("Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Initial Deposit: ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine(); // consume the leftover newline

        // Check if we have an account with the same number
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("=====================================================");
                System.out.println("    Account number already exists");
                System.out.println("=====================================================");
                return;
            }
        }

        Account account = new Account(accountNumber, depositAmount);
        Customer customer = new Customer(customerName, account);

        // Adding the account to the list of available accounts
        this.accounts.add(account);

    }

    // Deposit to an account with the given account number
    public void deposit() {
        System.out.println("Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume the leftover newline

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("=====================================================");
            System.out.println("    Deposit successful.");
            System.out.println("=====================================================");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw from an account
    public void withdraw() {
        System.out.println("Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume the leftover newline

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("=====================================================");
            System.out.println("    Withdraw successful.");
            System.out.println("=====================================================");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Checking the balance of the given account (Number)
    public void checkBalance() {
        System.out.println("Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("=====================================================");
            System.out.println("    Account Balance: " + account.getBalance() + " USD");
            System.out.println("=====================================================");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Find an account with the given account number
    public Account findAccount(int accountNumber) {
        for (Account account : this.accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    // Get the list of all the accounts
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
