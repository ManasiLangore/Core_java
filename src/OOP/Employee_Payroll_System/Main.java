package OOP.Employee_Payroll_System;

import java.util.ArrayList;

//class employee
// ----------------------------
// 🔹 ABSTRACT CLASS: Employee
// ----------------------------
// This class defines the common properties and methods for all employees.
// It uses Abstraction and Encapsulation principles of OOP.
abstract class Employee{
    // 🔒 Encapsulation: making fields private
    private String name;
    private int id;

    //constructor: used to initialize object data
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //// 👇 Getter methods (Encapsulation: controlled access to data)
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    // Abstract method — must be implemented by subclasses
    // This demonstrates ABSTRACTION (we define what, not how)
    public abstract double calculateSalary();

    // Polymorphism Example:
    // This method is overridden to print custom employee details
    @Override
    public String toString(){
        return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}

//SUBCLASS: full-time employee
// Inherits from Employee and provides its own salary calculation.
// Demonstrates INHERITANCE and POLYMORPHISM.
class FullTimeEmployee extends Employee{
    private double monthlySalary;

    // Constructor uses 'super' to call parent class constructor
    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);//if you want to use another class constructor
                        //use super keyword  Calls Employee(name, id)
        this.monthlySalary = monthlySalary;
    }

    // Method Overriding (Polymorphism)
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

//subclass part-time employee
// Another child class with different salary calculation logic.
// Shows POLYMORPHISM — same method name, different behavior.
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    //constructor
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Overridden method — calculates based on hours and rate
    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}

//class payroll system
// Demonstrates COMPOSITION — it contains a list of Employee objects.
class PayrollSystem{
    // Stores all employees (both full-time and part-time)
    private ArrayList<Employee> employeeList;
    // Constructor initializes the employee list
    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    //add an employee
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    //remove an employee by ID
    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        // Loop through all employees to find the matching ID
        for(Employee employee : employeeList){
            if(employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        // If found, remove from list
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    //display an employee
    public void displayEmployees(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}

//main class
// Demonstrates how objects interact (Object creation, Inheritance, Polymorphism)
public class Main {
    public static void main(String[] args) {
        // Create PayrollSystem object
        PayrollSystem payrollSystem = new PayrollSystem();
        // Create Employee objects
        FullTimeEmployee F_emp1 = new FullTimeEmployee("Manasi",101,90000);
        FullTimeEmployee F_emp2 = new FullTimeEmployee("Priya", 102,50000);
        PartTimeEmployee P_emp1 = new PartTimeEmployee("Shruti",201,40,100);

        //adding employee
        payrollSystem.addEmployee(F_emp1);
        payrollSystem.addEmployee(P_emp1);

        System.out.println("Initial Employee Details: ");

        //display an employee list
        payrollSystem.displayEmployees();

        //remove an employee
        System.out.println("Removing employee....");
        payrollSystem.removeEmployee(201);

        //updated employee list
        System.out.println("Remaining employee details: ");
        payrollSystem.displayEmployees();
    }
}
