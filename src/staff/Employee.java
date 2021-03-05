package staff;

import com.company.AddStaff;
import com.company.ICalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee extends Staff implements ICalculator, AddStaff {
    List<Staff> myEmployee = new ArrayList<>();
    private int extraWorkingHours;

    public Employee(String id, String name, String department, String dateIn, int age, int coefficientsSalary, int dayOff, int extraWorkingHours,int salary) {
        super(id, name, department, dateIn, age, coefficientsSalary, dayOff,salary);
        this.extraWorkingHours = extraWorkingHours;

    }

    public int getExtraWorkingHours() {
        return extraWorkingHours;
    }

    public void setExtraWorkingHours(int extraWorkingHours) {
        this.extraWorkingHours = extraWorkingHours;
    }


    public Employee() {
        super();
    }

    @Override
    public void calculator() {
//        super.salary = this.getCoefficientsSalary() * 3000000 + this.extraWorkingHours * 200000;
    }
    // add
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's id: ");
        String id = scanner.next();
        System.out.println("Enter employee's name: ");
        String name = scanner.next();
        System.out.println("Enter employee's department: ");
        String department = scanner.next();
        System.out.println("Enter employee's day in: (dd/mm/yyyy)");
        String dateIn = scanner.next();
        System.out.println("Enter employee's age: ");
        int age = scanner.nextInt();
        System.out.println("Enter employee's coefficientsSalary: ");
        int coefficientsSalary = scanner.nextInt();
        System.out.println("Enter employee's day off: ");
        int dayOff = scanner.nextInt();
        System.out.println("Enter employee's extra working hours: ");
        int extraWorkingHours = scanner.nextInt();

        addEmployee(id.toUpperCase(), name, department, dateIn, age, coefficientsSalary, dayOff, extraWorkingHours, (int) setSalary(coefficientsSalary* 3000000 + extraWorkingHours * 200000));
        System.out.println("New Employee has been added");
    }

    public void addEmployee(String id, String name, String department, String dateIn, int age, int coefficientsSalary, int dayOff, int extraWorkingHours, int salary) {
        Employee employee = new Employee(id, name, department, dateIn, age, coefficientsSalary, dayOff, extraWorkingHours, salary);
        myEmployee.add(employee);
    }


    //display
    public void display() {
        System.out.println(String.format("%-10s%-10s%-20s%-15s%-10s%-20s%-10s%-10s", "id", "name", "department", "dateIn", "age", "coefficientsSalary", "dayOff", "salary"));
        for (Staff employee : myEmployee) {
            System.out.println(employee.toString());
        }
    }



}
