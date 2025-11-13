package ExcercicioException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int num = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.println();
            
            
            Account account = new Account(num, holder, balance, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println(account);
        } catch (OverBalanceException e) {
            System.out.println("Withdraw error: "+ e.getMessage());
        }
        catch (OverLimitException e) {
            System.out.println("Withdraw error: "+ e.getMessage());
        }
        sc.close();
    }
    
}
