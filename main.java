import java.util.Locale;

public class main {
    public static void main(String[] args){
		
		System.out.println("Olá mundo");
		
		int y = 32;
		double x = 10.20374;
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		
		Locale.setDefault(Locale.US);
		System.out.print("Usando o Locale: ");
		System.out.printf("%.2f%n",x); //%n é quebra de linha
		
		System.out.print("RESULTADO = "+ y + " Metros");
		System.out.printf("%nRESULTADO = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 40000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f %n",nome,idade, renda);
	}
}
