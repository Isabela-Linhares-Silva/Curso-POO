import java.util.Scanner;

public class exercicios_funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Area de um circulo
        double raio;
        double π = 3.14159;
        raio = sc.nextDouble();
        double area = π * Math.pow(raio, 2.0);
        
        System.out.println("Area = "+ area);
        //Diferença e produto
        int A, B, C, D;
        A = sc.nextInt(); 
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        int DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);

        //Salario funcionário
        int numFunc, horas;
        double valorHora, salario;
        numFunc = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = valorHora * (double)horas;
        System.out.println("NUMBER = "+numFunc);
        System.out.println("SALARY = U$ "+salario);

        sc.close();
    }
}
