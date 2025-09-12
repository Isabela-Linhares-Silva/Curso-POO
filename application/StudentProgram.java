package application;

import java.util.Scanner;

import entities.Student;

public class StudentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Informe o nome: ");
        student.name = sc.nextLine();
        System.out.print("Informe a primeira nota: ");
        student.n1 = sc.nextFloat();
        System.out.print("Informe a segunda nota: ");
        student.n2 = sc.nextFloat();
        System.out.print("Informe a terceira:  ");
        student.n3 = sc.nextFloat();

        System.out.println("FINAL GRADE = "+student.totalGrade());
        student.grade();

        sc.close();
    }
}
