package Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;
Scanner scanner =new Scanner(System.in);

    public Vehicle(String regNo, String make, int yearOfManufacture, double value){
        this.regNo=regNo;
        this.make=make;
        this.yearOfManufacture=yearOfManufacture;
        this.value=value;
    }
    public void displayMenu(){

        Scanner scanner = new Scanner(System.in);
        int choice =0;
        do{
            System.out.println("Please select a following option");
            System.out.println("1. Add a vehicle\n2. Display a list of vehicle" +
                    " \n3. Delete vehicle\n4. Quit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addVehicle();
                    break;
                case 2:
                    listVehicle();
                    break;
                case 3:
                    removeVehicle(make);
                    break;
                case 4:
                    break;
            }
        }while (choice != 4);
    }

    public void addVehicle(){
        System.out.println("Enter model of Car:");
        make = scanner.nextLine();
        System.out.println("Enter registration number of Car:");
        regNo=scanner.nextLine();
        System.out.println("Enter year of Car:");
        yearOfManufacture= scanner.nextInt();
        System.out.println("Enter price of Car:");
        value= scanner.nextDouble();

        Vehicle vehicle = new Vehicle(make,regNo,yearOfManufacture,value);
        vehicles.add(vehicle);
    }

    public void removeVehicle(String model){
        for (int i=0; i< vehicles.size();i++){
            if (vehicles.get(i).make.equals(model)){
                vehicles.remove(i);
            }
//            System.out.println(i+1+". name of vehicle is "+vehicles.get(i));
        }

    }

    public void listVehicle(){
        for (int i=0; i< vehicles.size();i++){
            System.out.println(i+1+". name of vehicle is "+vehicles.get(i));
        }
    }

    public String getRegNo() {
        return regNo;
    }

    public String getMake() {
        return make;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int calculateYear(int year){
        return year - yearOfManufacture;
    }


}
