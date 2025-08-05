import java.util.Scanner;

public class exercicios_condicional {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num;
        System.out.println("Informe um numero: ");
        num = sc.nextInt();
        if (num<0) {
            System.out.println("NEGATIVO");
        }
        else
            System.out.println("NAO NEGATIVO");

        int inicio, fim, duracao;
        System.out.println("Informe que horas o jogo comecou: ");
        inicio = sc.nextInt();
        System.out.println("Informe que horas o jogo terminou: ");
        fim = sc.nextInt();

        if (inicio > fim) {
            duracao = inicio - fim;
        }
        else if (fim > inicio) {
            duracao = fim - inicio;
        }
        else
            duracao = 24;
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        double valor;
        System.out.println("Informe um valor: ");
        valor = sc.nextDouble();
        if (valor < 0) {
            System.out.println("Fora de intervalo");
        }
        else if (valor < 26) {
            System.out.println("Intervalo [0,25]");
        }
        else if (valor < 51 ) {
            System.out.println("Intervalo (25,50]");
        }
        else if (valor < 76) {
            System.out.println("Intervalo (50,75]");
        }
        else 
            System.out.println("Intervalo (75,100]");

        sc.close();
    }
}
