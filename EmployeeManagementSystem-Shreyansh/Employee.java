package org.example;

abstract public class Employee {
    String  name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract int calculateSalary();

}
