package application;

import java.util.Scanner;

import util.Circle;

public class CircleProgramV2 {
    public static void main(String[] args) {// já que vem de outra pasta, foi neceessario instanciar, as funções tbm nao precisam estar estáticas
        Scanner sc = new Scanner(System.in);
        Circle circ = new Circle();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circ.circumference(radius);

        double v = circ.volume(radius);

        System.out.printf("Circumference: %.2f\n",c);
        System.out.printf("Volume: %.2f\n",v);
        System.out.printf("PI: %.2f\n ",circ.PI);
        sc.close();
    }
}
