import java.util.Scanner;

public class areatriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measures for triangle X:");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();
        System.out.println("Enter the measures for triangle Y:");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();

        double p = (xA + xB + xC)/2.0;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        double h = (yA + yB + xC)/2.0;
        double areaY = Math.sqrt(h*(h-yA)*(h-yB)*(h-yC));
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
