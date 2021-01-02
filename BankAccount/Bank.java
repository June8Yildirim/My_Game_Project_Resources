package BankAccount;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> list = new ArrayList<BankAccount>();


    private int search(String accNumber) {
        for (int i = 0; i < list.size()-1; i++) {
            BankAccount tempAcc = list.get(i);
            String tempNumber = tempAcc.getAccountNumber();
            if (tempNumber.equals(accNumber)){
                return i;
            }
        }
        return -999;
    }

    public int getTotal() {
        return list.size();
    }

    public BankAccount getItem(String item) {
        int index = search(item);
        if (index != -999) {
            return list.get(index);
        } else {
            return null;
        }
    }

    public boolean addAccount(String accountNumber, String accountName) {
        if (search(accountNumber) == -999) {
            list.add(new BankAccount(accountNumber, accountName));
            return true;
        } else {
            return false;
        }


    }

    public boolean depositMoney(String accountNumber, double money) {
        BankAccount account = getItem(accountNumber);
        if (account != null) {
            account.deposit(money);
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawMoney(String accountNumber, double money) {
        BankAccount account = getItem(accountNumber);
        if (account != null && account.getBalance()>money) {
            account.withdraw(money);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAccount(String accountNumber) {
        int index = search(accountNumber);
        if (index != -999) {
            list.remove(index);
            return true;
        } else {
            return false;
        }
    }
}

