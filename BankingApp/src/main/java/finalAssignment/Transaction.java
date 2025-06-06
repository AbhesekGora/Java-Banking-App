package finalAssignment;

/**
 * The Transaction class provides a method to transfer funds between accounts.
 */
public class Transaction {
    /**
     * Transfers an amount from the source account to the destination account.
     * 
     * @param sourceAccount the account to transfer funds from
     * @param destinationAccount the account to transfer funds to
     * @param amount the amount to transfer
     */
    public void transfer(Account sourceAccount, Account destinationAccount, double amount) {
        destinationAccount.deposit(amount);
        sourceAccount.withdraw(amount);
    }
}
