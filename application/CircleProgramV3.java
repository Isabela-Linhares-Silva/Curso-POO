package application;

import java.util.Scanner;

import util.CircleV3;

public class CircleProgramV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = CircleV3.circumference(radius);
        // utiliza diretamente a classe, já que ela está estatica, como se fosse um "Math"

        double v = CircleV3.volume(radius);

        System.out.printf("Circumference: %.2f\n",c);
        System.out.printf("Volume: %.2f\n",v);
        System.out.printf("PI: %.2f\n ",CircleV3.PI);
        sc.close();
    }
}
