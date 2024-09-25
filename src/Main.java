import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Let's begin with creating a new instance of our Bank
        Bank bank = new Bank("ADAMO-BMS");
        Scanner scanner = new Scanner(System.in);

        char option;

        System.out.println("====================== Welcome to the ADAMO-BMS ========================");
        System.out.println("=======================================================================");
        System.out.println("===========  Please choose one of the following options: ==============");

        // Do While the option != 'q'
        do {
            System.out.println("(1)- Create a new account");
            System.out.println("(2)- Deposit to an account");
            System.out.println("(3)- Withdraw from an account");
            System.out.println("(4)- Check balance of an account");
            System.out.println("(5)- List all accounts");
            System.out.println("(Q/q)- Exit");
            option = scanner.next().toLowerCase().charAt(0);

            switch (option) {
                case '1':
                    bank.addAccount();
                    break;

                case '2':
                    bank.deposit();
                    break;

                case '3':
                    bank.withdraw();
                    break;

                case '4':
                    bank.checkBalance();
                    break;

                case '5':

                    ArrayList<Account> accounts = bank.getAccounts();
                    if (!accounts.isEmpty()) {
                        System.out.println("List of accounts:");
                        System.out.println("=====================================================");
                        for (Account account : accounts) {
                            System.out.println("    Account number: " + account.getAccountNumber());
                            System.out.println("    Balance: " + account.getBalance() + " USD");
                            System.out.println("=====================================================");
                        }
                    } else {
                        System.out.println("No accounts found");
                        System.out.println("=====================================================");
                    }
                    break;

                case 'q':
                    System.out.println("============ Thanks for using ADAMO-BMS. See you soon ==============");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        } while (option != 'q');
    }
}
