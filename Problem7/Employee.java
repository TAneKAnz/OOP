package Problem7;

import java.util.*;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired = new Date();

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        dateHired = new Date();

    }

    public String getOffice() {
        return office;

    }

    public double getSalary() {
        return salary;

    }

    public Date getDateHired() {
        return dateHired;

    }

    public void setOffice(String office) {
        this.office = office;

    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    public String toString() {
        return super.toString() + String.format("\nEmployee{office=%s, dateHired={%s}, salary=%.2f}\n",
                getOffice(), getDateHired(), getSalary());
    }

}