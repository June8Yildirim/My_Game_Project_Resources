package Employee;

public abstract class Employee {
    private String number;
    private String name;

    public Employee(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return  "Your status is";
    }


}
