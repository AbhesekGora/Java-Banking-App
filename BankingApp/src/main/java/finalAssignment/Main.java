package finalAssignment;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.LinkedList;

public class Main {

    /**
     * The main method is the entry point of the application.
     * It demonstrates basic account operations and initializes the GUI with account data read from a CSV file.
     * @param args Command line arguments 
     */
    public static void main(String[] args) {
        // Creating two sample accounts for testing
        Account account1 = new Account("Jeffrey", "Ting", 1, 2000);
        Account account2 = new Account("Hiran", "Patel", 2, 1000);

        // Displaying initial balances
        System.out.println("The balance of account 1 is " + account1.getBalance());
        System.out.println("The balance of account 2 is " + account2.getBalance());

        // Performing deposit and displaying balance
        account1.deposit(250);
        System.out.println("The balance of account 1 after deposit: " + account1.getBalance());

        // Performing withdrawal and displaying balance
        account2.withdraw(500);
        System.out.println("The balance of account 2 after withdrawal: " + account2.getBalance());

        // Performing a transfer between the two accounts
        Transaction t = new Transaction();
        t.transfer(account1, account2, 250);

        // Displaying balances after transfer
        System.out.println("The balance of account 1 after transaction is " + account1.getBalance());
        System.out.println("The balance of account 2 after transaction is " + account2.getBalance());

        // Using try-catch to handle potential IO exceptions during file reading
        try {
            LinkedList<Account> accounts = new LinkedList<>();

            // Reading accounts from a CSV file
           ReadAccounts readAccounts = new ReadAccounts("C:\\Users\\Computer\\Documents\\NetBeansProjects\\BankingApp\\data\\Accounts.csv");

            // Extracting account data
            LinkedList<Integer> accountList = readAccounts.getAccounts();
            LinkedList<Integer> balanceList = readAccounts.getBalances();
            LinkedList<String> firstNames = readAccounts.getFirstNames();
            LinkedList<String> lastNames = readAccounts.getLastNames();

            // Populating accounts LinkedList with data from the CSV file
            for (int i = 0; i < firstNames.size(); i++) {
                accounts.add(new Account(firstNames.get(i), lastNames.get(i), accountList.get(i), balanceList.get(i)));
            }

            // Displaying accounts read from the file
            System.out.println("Accounts from the file are:");
            for (Account account : accounts) {
                System.out.println(account);
            }

            // Launching the GUI on the Event Dispatch Thread
           EventQueue.invokeLater(() -> {
    try {
        GUI window = new GUI(accounts);
        window.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
});

        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
