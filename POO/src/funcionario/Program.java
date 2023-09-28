package funcionario;

import java.util.Locale;
import java.util.Scanner;

import funcionario.entities.Person;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Enter the name of employee:");
        person.name = sc.nextLine();
        System.out.println("Enter the gross salary:");
        person.grossSalary = sc.nextDouble();
        System.out.println("Enter the tax:");
        person.tax = sc.nextDouble();

        person.netSalary();
        System.out.println(person);

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        person.increaseSalary(percentage);
        System.out.println(person);

        sc.close();
    }
}
