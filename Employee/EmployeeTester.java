package Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        tester();
        System.out.println("==============================");
        tester2();
        System.out.println("==============================");
        tester3();
        System.out.println("==============================");

    }

    static void tester() {
        FullTimeEmployee fte = new FullTimeEmployee("A123", "Ms Full-Time", 25000);
        PartTimeEmployee pte = new PartTimeEmployee("B456", "Mr Part-Time", 30);

        testMethod(fte); // call testMethod with a full-time employee object
        testMethod(pte); // call testMethod with a part-time employee object




    }

    static void testMethod(Employee employeeIn) // the method expects to receive an Employee object
    {
        System.out.println("Account holder name is: " + employeeIn.getName()+ "\nhis\\her status is "+employeeIn.getStatus());

    }

    static void tester2() {
        PartTimeEmployee pte1 = new PartTimeEmployee("A103456", "Mandy Lifeboats", 15.5);
        testMethod(pte1); // call testMethod with a part-time employee object

        System.out.println("Name of person is " + pte1.getName() +
                " and his\\her weekly salary is $" + pte1.calculateWeeklyPay(20) + ",");
    }

    static void tester3() {
        Employee emp; // a reference to an Employee
        char choice;
        String numberEntered, nameEntered;
        double salaryEntered, payEntered;
        System.out.print("Choose (F)ull-Time or (P)art-Time Employee: ");
        choice = EasyScanner.nextChar();
        System.out.print("Enter employee number: ");
        numberEntered = EasyScanner.nextString();
        System.out.print("Enter employee name: ");
        nameEntered = EasyScanner.nextString();
        if (choice == 'F' || choice == 'f') {
            System.out.print("Enter annual salary: ");
            salaryEntered = EasyScanner.nextDouble();
// create a FullTimeEmployee object
            emp = new FullTimeEmployee(numberEntered, nameEntered, salaryEntered);
        } else {
            System.out.print("Enter hourly pay: ");
            payEntered = EasyScanner.nextDouble();
// create a PartTimeEmployee object
            emp = new PartTimeEmployee(numberEntered, nameEntered, payEntered);
        }
        testMethod(emp); // call tester with the object created
    }
}
