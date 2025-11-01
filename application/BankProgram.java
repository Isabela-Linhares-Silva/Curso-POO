package application;

import java.util.Scanner;

import entities.Bank;

public class BankProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int num = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String hold = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)?: ");
        char initial = sc.next().charAt(0);

        Bank account;

        if(initial == 'y'||initial == 'Y'){
            System.out.print("Enter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Bank(num,hold,initialDeposit);
        }
        else
            account = new Bank(num, hold);

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter the deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Updated account data:");
        System.out.println(account);

        System.out.print("Enter the deposit value: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.print("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
