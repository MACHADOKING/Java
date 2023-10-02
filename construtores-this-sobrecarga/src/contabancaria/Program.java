package contabancaria;

import java.util.Locale;
import java.util.Scanner;

import contabancaria.entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Would you like to deposit an initial amount? (y/n)");
        String initialAmount = sc.next();

        double valueInitial;
        if (initialAmount.equalsIgnoreCase("y")) {
            System.out.println("How much would you like to deposit?");
            valueInitial = sc.nextDouble();
        } else {
            valueInitial = 0;
        }

        Conta conta = new Conta(name, accountNumber, valueInitial);

        System.out.println(conta);

        System.out.println();
        System.out.println("Enter a deposit value:");
        double value = sc.nextDouble();
        conta.addTotalInAccount(value);
        System.out.println("Updated account data:");
        System.err.println(conta);

        System.out.println("Enter a withdraw value:");
        value = sc.nextDouble();
        conta.degreeTotalInAccount(value);
        System.out.println("Updated account data:");
        System.out.println(conta);
        sc.close();
    }
}
