public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("You can't deposit a negative amount");
        } else {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            System.out.println("Insufficient funds or invalid amount");
            return;
        }

        this.balance -= amount;
        System.out.println("=====================================================");
        System.out.println("    Withdraw successful.");
        System.out.println("=====================================================");

    }

    // To string
    public String toString() {
        return "Account #" + accountNumber;
    }
}
