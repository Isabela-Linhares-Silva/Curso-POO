package application;

import java.util.Scanner;

public class CircleProgram {
    public static final double PI = 3.14;//final define que uma vez esse valor atribuido ele não mudará mais
    public static void main(String[] args) {// nao eh possivel chamar metodos que nao estaticos dentro de um estatico
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f\n",c);
        System.out.printf("Volume: %.2f\n",v);
        System.out.printf("PI: %.2f\n ",PI);
        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
        
}
