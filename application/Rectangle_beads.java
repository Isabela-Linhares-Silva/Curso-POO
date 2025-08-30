package  application;

import java.util.Scanner;
import entities.Rectangle;
public class Rectangle_beads {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Rectangle receive = new Rectangle();
        System.out.print("Enter rectangle width and height: ");
        receive.height =  sc.nextDouble();
        receive.width = sc.nextDouble();

        System.out.println(receive);

        sc.close();
    }
}
