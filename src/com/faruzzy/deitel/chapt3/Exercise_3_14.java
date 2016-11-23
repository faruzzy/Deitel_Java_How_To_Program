package com.faruzzy.deitel.chapt3;

/**
 * @author Roland
 */
public class Exercise_3_14_Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Exercise_3_14_Employee(String first, String last, double salary) {
        this.firstName = first;
        this.lastName = last;
        this.salary = salary;
    }

    public void setFirstName(String name) { this.firstName = name; }

    public String getFirstName() { return firstName; }

    public void setLastName(String name) { this.lastName = name; }

    public String getLastName() { return lastName; }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() { return salary; }

    public static void main(String... args) {
        Exercise_3_14_Employee employee1 = new Exercise_3_14_Employee("David", "Payton", 1340.50);
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": " + employee1.getSalary());

        Exercise_3_14_Employee employee2 = new Exercise_3_14_Employee("Rajesh", "Venkata", 2340.50);
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": " + employee2.getSalary());
    }
}
