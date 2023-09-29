package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Price:");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock:");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock:");
        int addQuantity = sc.nextInt();
        product.addProduct(addQuantity);

        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        int removeQuantity = sc.nextInt();
        product.removeProduct(removeQuantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
