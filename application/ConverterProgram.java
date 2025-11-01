package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class ConverterProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double value = sc.nextDouble();

        double reais = CurrencyConverter.Converter(price, value);

        System.out.printf("Amount to be paid in reais = %.2f\n", reais);
        sc.close();
    }
} 
