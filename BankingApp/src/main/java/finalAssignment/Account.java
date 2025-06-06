package finalAssignment;

/**
 * The Account class represents a bank account with a balance and account number.
 */
public class Account extends Customer {
    private double balance;
    private int accountNumber;

    public Account(String firstName, String lastName, int accountNumber, double balance) {
        super(firstName, lastName);
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + this.accountNumber + ", Holder Name: " +
               this.getFirstName() + " " + this.getLastName() + ", Balance: " + this.balance;
    }
}
