package application;

import java.util.Scanner;

import entities.ProductsV2;

public class StoreV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int stock = sc.nextInt();

        ProductsV2 item = new ProductsV2(name, price, stock);// dessa maneira força ao item a nao ser inicializado vazio, e indo direto para o objeto com a utilização do this
        //print
        System.out.print("Product ");
        item.TotalValueInStock();

        System.out.println("Enter the number of products to be added in stock: ");
        item.plus = sc.nextInt();
        System.out.println("Update the number of products to be removed from stock: ");
        item.remove = sc.nextInt();

        System.out.print("Update ");
        item.AddProducts();
        item.TotalValueInStock();
        System.out.print("Update ");
        item.RemoveProducts();
        item.TotalValueInStock();

        System.out.print("Product data: ");
        System.out.println(item);
        sc.close();
    }
}
