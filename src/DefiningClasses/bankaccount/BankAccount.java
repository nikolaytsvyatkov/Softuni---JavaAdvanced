package DefiningClasses.bankaccount;

public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.2;
    private static int counter = 1;
    private int id;
    private double balance;
    private static double interestRate = DEFAULT_INTEREST_RATE;

    public BankAccount() {
        this.id = BankAccount.counter++;
    }

    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }
    public double getInterest(int year) {
        return BankAccount.interestRate * year * this.balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return this.id;
    }
}
