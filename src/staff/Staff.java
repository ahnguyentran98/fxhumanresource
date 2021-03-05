package staff;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private String id,name,department, dateIn;
    private int age,coefficientsSalary,dayOff,salary;


    public Staff(String id, String name, String department, String dateIn, int age, int coefficientsSalary, int dayOff, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.dateIn = dateIn;
        this.age = age;
        this.coefficientsSalary = coefficientsSalary;
        this.dayOff = dayOff;
        this.salary = salary;


    }

    public Staff() {
        super();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(int coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-20s%-15s%-10d%-20d%-10d%-10d", id,name,department,dateIn,age,coefficientsSalary,dayOff,salary);
    }


}
