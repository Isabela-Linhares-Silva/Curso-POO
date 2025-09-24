package application;

import java.util.Scanner;

import entities.ProductsV3;

public class StoreV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();


        ProductsV3 item = new ProductsV3(name, price);// dessa maneira força ao item a nao ser inicializado vazio, e indo direto para o objeto com a utilização do this
        //print

        System.out.print("Product ");
        item.TotalValueInStock();

        item.setName("Computer");
        System.out.println("Update name: "+ item.getName());
        item.setPrice(1200.00);
        System.out.println("Update price: "+ item.getPrice());


        System.out.println("Enter the number of products to be added in stock: ");
        item.plus = sc.nextInt();
        System.out.println("Update the number of products to be removed from stock: ");
        item.remove = sc.nextInt();

        
        item.AddProducts();
        System.out.print("Update ");
        item.RemoveProducts();
        item.TotalValueInStock();

        System.out.print("Product data: ");
        System.out.println(item);
        sc.close();
    }
}
