import java.util.Scanner;

public class switchCase_e_ternária {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String semana;
        int dia;
        System.out.println("Informe o dia da semana: ");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                semana = "domingo";
                break;
            case 2:
                semana = "segunda";
                break;
            case 3:
                semana = "terca";
                break;
            case 4:
                semana = "quarta";
                break;
            case 5:
                semana = "quinta";
                break;
            case 6:
                semana = "sexta";
                break;
            case 7:
                semana = "sabado";
                break;
            default:
                semana = "Dia invalido";
                break;
        }

        System.out.println("Dia da semana: "+ semana);
        // Expressão condicional ternária
        double preco = 34.6;
        double desconto = (preco < 20) ? preco * 0.1 :  preco * 0.5;

        System.out.println(desconto);

        sc.close();
    }
}
