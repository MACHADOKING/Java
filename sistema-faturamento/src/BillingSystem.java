import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BillingItem> items = new ArrayList<>();

        System.out.println("Bem-vindo ao Sistema de Faturamento!");

        while (true) {
            System.out.print("Nome do item (ou 'sair' para encerrar): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("sair")) {
                break;
            }

            double pricePerUnit = 0; // Inicialize com um valor padrão
            boolean validPrice = false;

            while (!validPrice) {
                System.out.print("Preço por unidade (até 2 casas decimais): ");
                String priceInput = scanner.nextLine();

                // Use uma expressão regular para validar o preço com até 2 casas decimais
                if (priceInput.matches("\\d+(\\.\\d{1,2})?|\\d+(,\\d{1,2})?")) {
                    priceInput = priceInput.replace(",", "."); // Substitua a vírgula por ponto
                    pricePerUnit = Double.parseDouble(priceInput);
                    validPrice = true;
                } else {
                    System.out.println("Preço inválido. Use até 2 casas decimais.");
                }
            }

            System.out.print("Quantidade: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            BillingItem item = new BillingItem(itemName, pricePerUnit, quantity);
            items.add(item);
        }

        System.out.println("\nFatura:");
        double totalAmount = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        for (BillingItem item : items) {
            System.out.println(item);
            totalAmount += item.getTotalPrice();
        }

        String formattedTotalAmount = decimalFormat.format(totalAmount);
        System.out.println("\nTotal: $" + formattedTotalAmount);
        System.out.println("Obrigado por usar o Sistema de Faturamento!");
        scanner.close();
    }
}
