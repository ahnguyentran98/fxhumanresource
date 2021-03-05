package staff;

import com.company.AddStaff;
import com.company.ICalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Staff implements AddStaff, ICalculator {
    List<Staff> myManager = new ArrayList<>();
    private String position;
    private int responsibility;
    public Manager(String id, String name, String department, String dateIn, int age, int coefficientsSalary, int dayOff,String position,int salary) {
        super(id, name, department, dateIn, age, coefficientsSalary, dayOff,salary);
        this.position = position;
    }

    public Manager() {
        super();
    }
    //salary
    @Override
    public void calculator() {

    }
    //add
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter manager's id: ");
        String id = scanner.next();
        System.out.println("Enter manager's name: ");
        String name = scanner.next();
        System.out.println("Enter manager's department: ");
        String department = scanner.next();
        System.out.println("Enter manager's day in: (dd/mm/yyyy) ");
        String dateIn = scanner.next();
        System.out.println("Enter manager's age: ");
        int age = scanner.nextInt();
        System.out.println("Enter manager's coefficientsSalary: ");
        int coefficientsSalary = scanner.nextInt();
        System.out.println("Enter manager's day off: ");
        int dayOff = scanner.nextInt();
        System.out.println("Enter manager's position: (business leader, project leader or technical leader) ");
        String position = scanner.next();
        int responsibility;
        if (position.equalsIgnoreCase("business leader")){
            responsibility = 8000000;
        }else if (position.equalsIgnoreCase("project leader")){
            responsibility = 5000000;
        }else if (position.equalsIgnoreCase("technical leader")){
            responsibility = 6000000;
        }else {
            responsibility = 0;
        }
        addManager(id.toUpperCase(), name, department, dateIn, age, coefficientsSalary, dayOff, position, (int) setSalary(coefficientsSalary*5000000 + responsibility));
        System.out.println("New Manager has been added");
    }
    public void addManager(String id, String name, String department, String dateIn, int age, int coefficientsSalary, int dayOff,String position,int salary) {
        Manager manager = new Manager(id, name, department, dateIn, age, coefficientsSalary, dayOff, position, salary);
        myManager.add(manager);
    }


    //display
    public void display() {
        for (Staff manager : myManager) {
            System.out.println(manager.toString());
        }
    }
}
