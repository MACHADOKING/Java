package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.Person;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoa serão digitadas?");
        int n = sc.nextInt();
        Person[] person = new Person[n];

        for (int i = 0; i < person.length; i++) {
            System.out.println("Dados da " + (i + 1) + "° pessoa:");
            System.out.println("Nome:");
            String name = sc.next();
            System.out.println("Idade:");
            int age = sc.nextInt();
            System.out.println("Altura:");
            double height = sc.nextDouble();
            person[i] = new Person(name, age, height);
        }

        int totalPerson = 0;
        double totalHeight = 0.0;

        for (int i = 0; i < person.length; i++) {
            totalHeight += person[i].getHeight();
            int verifyPerson = person[i].getAge();
            if (verifyPerson < 16) {
                totalPerson++;
            }
        }

        totalPerson = (totalPerson * 100) / person.length;
        double halfHeight = totalHeight / person.length;

        System.out.printf("A média de altura é: %.2f%n", halfHeight);
        System.out.println("A porcentagem de pessoas com menos de 16 anos é: " + totalPerson + "%.");

        for (int i = 0; i < person.length; i++) {
            int verifyPerson = person[i].getAge();
            if (verifyPerson < 16) {
                String minor = person[i].getName();
                System.out.println(minor);
            }
        }

        sc.close();
    }
}
