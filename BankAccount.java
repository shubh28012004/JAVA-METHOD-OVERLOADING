public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();
    }
}
