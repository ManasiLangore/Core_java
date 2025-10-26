package OOP.Employee_Payroll_System;

//class employee
abstract class Employee{
    private String name;
    private int id;

    //constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //method
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    //abstract method
    public abstract double calculateSalary();

    //polymorphism
    @Override
    public String toString(){
        return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}

//class full-time employee
class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);//if you want to use another class constructor
                        //use super keyword
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

//class part-time employee
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    //constructor
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}

//class payroll system

public class Main {
    public static void main(String[] args) {

    }
}
