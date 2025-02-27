package org.example;

public class PartTimeEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, int hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    int calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    int days;


}
