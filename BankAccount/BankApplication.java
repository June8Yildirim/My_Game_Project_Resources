package BankAccount;

public class BankApplication {
    public static void main(String[] args) {
        char choice;
        Bank myBank = new Bank();
        do {
            System.out.println();
            System.out.println("1. Create a new account.");
            System.out.println("2. Remove an account.");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Check account details.");
            System.out.println("6: Quit");
            System.out.println("Enter choice [1-6] : ");
            //get choice
            choice = EasyScanner.nextChar();
            System.out.println();
            switch (choice) {
                case '1':
                    option1(myBank);
                    break;
                case '2':
                    option2(myBank);
                    break;
                case '3':
                    option3(myBank);
                    break;
                case '4':
                    option4(myBank);
                    break;
                case '5':
                    option5(myBank);
                    break;
                case '6':
                    break;
                default:
                    System.out.println("Invalid Entry");
            }

        }while (choice != '6') ;
    }

    static void option1(Bank bank) {
        //get details from user
        System.out.println("Enter your account number");
        String number = EasyScanner.nextString();
        System.out.println("Enter account name");
        String name = EasyScanner.nextString();
        //add account to the list
        boolean success = bank.addAccount(number, name);
        if (success) {
            System.out.println("Account added");
        } else {
            System.out.println("Account number already exists");
        }
    }

    static void option2(Bank bank) {
        System.out.println("Enter your account number");
        String number = EasyScanner.nextString();
        // delete item if it exists
        boolean found = bank.removeAccount(number);
        if (found) {
            System.out.println("Account removed");
        } else {
            System.out.println("Account number is not exists");
        }
    }

    static void option3(Bank bank) {
        System.out.println("Enter your account number");
        String number = EasyScanner.nextString();
        System.out.println("Enter amount to deposit");
        double amount = EasyScanner.nextDouble();
        boolean found = bank.depositMoney(number, amount);
        if (found) {
            System.out.println("Amount deposited in your account");
        } else {
            System.out.println("Account number is not exists");
        }
    }

    static void option4(Bank bank) {
        System.out.println("Enter your account number");
        String number = EasyScanner.nextString();
        System.out.println("Enter amount to Withraw");
        double amount = EasyScanner.nextDouble();
        boolean found = bank.withdrawMoney(number, amount);
        if (found) {
            System.out.println("Amount withdraw from in your account");
        } else {
            System.out.println("Account number is not exists");
        }
    }

    static void option5(Bank bank) {
        System.out.println("Enter your account number");
        String number = EasyScanner.nextString();

        BankAccount account = bank.getItem(number);
        if (account != null) {
            System.out.println("Account number is : " + account.getAccountNumber());
            System.out.println("Account name is :" + account.getAccountName());
            System.out.println("Current balance is :" + account.getBalance());
            System.out.println();
        } else {
            System.out.println("Account number is not exists");
        }
    }
}
