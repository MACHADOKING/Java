package program7.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import program7.entities.Item;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Item> list = new ArrayList<>();
        System.out.print("Do you want to generate a file with sold items? (y/n)");
        String yn = sc.next().trim().toLowerCase();

        while ("y".equals(yn)) {
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            System.out.print("Sales Quantity : ");
            Integer quantity = sc.nextInt();
            list.add(new Item(name, price, quantity));
            System.out.println();
            System.out.print("Do you want to continue registering? (y/n)");
            yn = sc.next().trim().toLowerCase();
        }

        sc.nextLine();
        System.out.print("Enter file path: ");
        String strPath = sc.nextLine();

        sc.close();

        File sourceFile = new File(strPath);
        String sourceFolderStr = sourceFile.getParent();

        boolean sucess = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
            for (Item item : list) {
                bw.write(item.getName() + "," + String.format("%.2f", item.subTotal()));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                System.out.println(itemCsv);
                itemCsv = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // System.out.print("How many items will you register?");
        // int n = sc.nextInt();

        // for (int i = 0; i < n; i++) {
        // System.out.println("Item #" + (n + 1) + ":");
        // System.out.print("Name: ");
        // sc.nextLine();
        // String name = sc.nextLine();
        // System.out.print("Price: ");
        // Double price = sc.nextDouble();
        // System.out.print("Quantity: ");
        // Integer quantity = sc.nextInt();
        // list.add(new Item(name, price, quantity));
        // }
    }
}
