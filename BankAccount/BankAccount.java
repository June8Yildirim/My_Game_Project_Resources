package BankAccount;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    protected double balance;
    private double interestRate;

    public BankAccount() {
        this.accountNumber = "999";
        this.accountName = "John Doe";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amountMoney) {
        this.balance += amountMoney;
    }

    public boolean withdraw(double amountMoney) {
        if (this.balance > amountMoney) {
            this.balance -= amountMoney;
            return true;
        } else {
            System.out.println("You don't have sufficient money in your account!");
            System.out.println("main method is called");
            return false;
        }
    }

    public String toString() {
        return "Name: " + accountName + "\n" + "Account Number: " + accountNumber + "\n" + "Balance: " + balance;
    }

    public void addInterest() {
        this.balance += (this.balance * this.interestRate) / 100;
    }
}
