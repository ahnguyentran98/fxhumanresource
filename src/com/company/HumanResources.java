package com.company;

import staff.Employee;
import staff.Manager;
import staff.Staff;

import java.util.Scanner;

public class HumanResources {
    private static Employee employee = new Employee();
    private static Manager manager = new Manager();
    private static Staff staff = new Staff();

    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------");
            System.out.println("1. Enter a new staff, ");
            System.out.println("2. Display staff");
            System.out.println("Your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("0(employee) and 1(manager)");
                    int secondChoice = sc.nextInt();
                    if (secondChoice == 0){
                        employee.add();
                    } else if (secondChoice ==1){
                        manager.add();
                    }
                    break;
                case 2:

                    employee.display();
                    manager.display();
                    break;

            }
        }
    }
}
