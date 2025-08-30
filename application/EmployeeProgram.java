package application;

import java.util.Scanner;

import entities.Employee;

public class EmployeeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        System.out.print("Employee: ");
        System.out.println(emp);

        System.out.print("Wich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.print("Updated data: ");
        System.out.println(emp);
        sc.close();
    }
}
