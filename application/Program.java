package application;

import java.util.Scanner;
import entities.Triangle;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures for triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures for triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c)/2.0;
        double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));

        double h = (y.a + y.b + x.c)/2.0;
        double areaY = Math.sqrt(h*(h-y.a)*(h-y.b)*(h-y.c));
        System.out.printf("Area X = %.4f\n",areaX);
        System.out.printf("Area Y = %.4f\n",areaY);

        if (areaX > areaY) {
            System.out.println("Larger triangle area: X");
        }
        else
            System.out.println("Larger triangle area: Y");

        sc.close();
    } 
}
