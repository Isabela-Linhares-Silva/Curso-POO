import java.util.Scanner;

public class exercicios_while {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // Senha correta
        int senha = 2002;
        System.out.println("Digite a senha: ");
        int recebido = sc.nextInt();
        while (recebido != senha) {
            System.out.println("Senha Invalida");
            recebido = sc.nextInt();
        }

        System.out.println("Acesso Permitido");  

        // posto de gasolina
        System.out.printf(" 1.Álcool%n 2.Gasolina%n 3.Diesel%n 4.Fim%n");
        int cod = sc.nextInt();
        int a = 0 , g = 0, d = 0;
        while (cod != 4) {
            if (cod != 1 && cod != 2 && cod!=3) {
                cod = sc.nextInt();
            }
            else if (cod == 1) {
                a++;
                cod = sc.nextInt();
            }
            else if (cod == 2) {
                g++;
                cod = sc.nextInt();
            }
            else if (cod == 3) {
                d++;
                cod = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADA!");
        System.out.printf("Alcool: %d %nGasolina: %d %nDiesel: %d%n", a,g,d);

        sc.close();
    }
}
