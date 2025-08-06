import java.util.Scanner;

public class estrutura_repetitva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while
        int x = sc.nextInt();
        int soma =0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt(); 
        }
        System.out.println("RESULTADO: " + soma);
        
        // for
        System.out.println("Quantas vezes? ");
        int n = sc.nextInt();
        int S = 0;
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            S += y;
        }
        System.out.println("RESULTADO: " + S);    
        
        sc.close();
    }
}
