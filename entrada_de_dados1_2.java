import java.util.Scanner;

public class entrada_de_dados1_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String x;
    int y;
    double z;
    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();

    System.out.println("Voce digitou: ");
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    sc.close();
    }
}
