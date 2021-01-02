package BankAccount;

public class BankAccountTester {
    public static void main(String[] args){
        boolean ok;
        // declare Bank account
        BankAccount account1= new BankAccount("T123","Tim");
        BankAccount account2 = new BankAccount("J234", "John");
        //declare a GoldAccount object
        GoldAccount goldAccount = new GoldAccount("123","Jack",500);
        account1.deposit(1000);
        account2.deposit(4000);
        goldAccount.deposit(1000);

        account2.setInterestRate(10);
        account1.addInterest();
        account2.addInterest();
        System.out.println("Account number is :"+ account1.getAccountNumber()+"" +
                "\nAccount holder's name is : "+account1.getAccountName());
        System.out.println("The interest rate is :"+ account1.getInterestRate());
        System.out.println("Current balance is :"+ account1.getBalance());
        System.out.println("===================");
        System.out.println("Account number is :"+ account2.getAccountNumber()+"" +
                "\nAccount holder's name is : "+account2.getAccountName());
        System.out.println("The interest rate is :"+ account2.getInterestRate());
        System.out.println("Current balance is :"+ account2.getBalance());
        System.out.println("====================");
        BankAccount account3 = new BankAccount("B355", "Bob");
        test(account3);
        System.out.println("Account number is :"+ account3.getAccountNumber()+"" +
                "\nAccount holder's name is : "+account3.getAccountName());
        System.out.println("The interest rate is :"+ account3.getInterestRate());
        System.out.println("Current balance is :"+ account3.getBalance());
        System.out.println("===============");
        ok = account1.withdraw(1250);
        if (ok){
            System.out.println("Money withdrawn.");
        }else {
            System.out.println("Insufficient funds.");
        }
        System.out.println("Balance of "+ account1.getAccountName()+ " is "+account1.getBalance());
        System.out.println("======");
        ok =goldAccount.withdraw(1250);
        if (ok){
            System.out.println("Money withdrawn.");
        }else {
            System.out.println("Insufficient funds.");
        }
        System.out.println("Balance of "+ goldAccount.getAccountName()+ " is "+goldAccount.getBalance());
        System.out.println("======");

    }
    static void test(BankAccount account){
        account.deposit(5000);
    }
}
