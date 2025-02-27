package org.example;

public class FullTimeEmployee extends Employee{

    private int monthlySalary;

    public FullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    int calculateSalary() {
        return monthlySalary;
    }
}

