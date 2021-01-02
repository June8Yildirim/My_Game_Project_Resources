package BankAccount;

public class GoldAccount extends BankAccount {
    private double overdraftLimit;


    public GoldAccount(String accountNumber, String accountName, double overdraftLimit) {
        super(accountNumber, accountName);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amountMoney) {
        if (amountMoney> balance+overdraftLimit){
            return false;
        }else{
            balance = balance- amountMoney;
            System.out.println("override method is called");
            return true;
        }
    }
}
