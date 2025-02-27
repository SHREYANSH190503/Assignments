package org.example;

public class Main {
    public static void main(String[] args) {

        Employee fullTime = new FullTimeEmployee("Alice", 101, 50000);
        Employee partTime = new PartTimeEmployee("Bob", 102, 500, 20);

        System.out.println(fullTime.name + "'s Salary: $" + fullTime.calculateSalary());
        System.out.println(partTime.name + "'s Salary: $" + partTime.calculateSalary());
    }
}