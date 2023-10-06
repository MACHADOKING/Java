package program5.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import program5.entities.LegalPerson;
import program5.entities.Person;
import program5.entities.PhysicalPerson;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char individualOrCompany = sc.next().trim().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (individualOrCompany == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Person pp = new PhysicalPerson(name, anualIncome, healthExpenditures);
                list.add(pp);
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                Person lp = new LegalPerson(name, anualIncome, numberEmployees);
                list.add(lp);
            }
        }
        sc.close();

        System.out.println();
        System.out.println("TAXES PAID:");

        for (Person person : list) {
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
        }

        double sum = 0.0;
        for (Person person : list) {
            sum += person.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    }
}
