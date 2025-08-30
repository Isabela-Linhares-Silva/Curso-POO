package application;

import java.util.Scanner;

import entities.Products;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products item = new Products();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        item.name = sc.nextLine();
        System.out.print("Price: ");
        item.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        item.stock = sc.nextInt();
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
