public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    // To string
    public String toString() {
        return "Customer Name: " + this.name + "\n" +
                "Account Number: " + this.account.getAccountNumber();
    }

    // Setters
    public void setAccount(Account account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }
}
