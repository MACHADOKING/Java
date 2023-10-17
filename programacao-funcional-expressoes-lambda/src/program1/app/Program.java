package program1.app;

import java.util.ArrayList;
// import java.util.Comparator;
import java.util.List;
import java.util.Locale;
// import java.util.function.Predicate;

import program1.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Comparator<Product> comp = (p1, p2) ->
        // p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        /*
         * Comparator<Product> comp = (p1, p2) -> {
         * return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
         * };
         */

        /*
         * Comparator<Product> comp = new Comparator<Product>() {
         * 
         * @Override
         * public int compare(Product p1, Product p2) {
         * return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
         * }
         * };
         */

        // list.sort(comp);

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }

        List<Product> list2 = new ArrayList<>();

        list2.add(new Product("Tv", 900.00));
        list2.add(new Product("Mouse", 50.00));
        list2.add(new Product("Tablet", 350.50));
        list2.add(new Product("HD Case", 80.90));

        // list2.removeIf(new ProductPredicate());
        // list2.removeIf(Product::staticProductPredicate);
        // list2.removeIf(Product::nonStaticProductPredicate);

        double min = 100.0;

        // Predicate<Product> pred = p -> p.getPrice() >= 100.00;
        /*
         * Predicate<Product> pred = p -> p.getPrice() >= min;
         * list2.removeIf(pred);
         */

        list2.removeIf(p -> p.getPrice() >= min);

        System.out.println();
        System.out.println();
        for (Product p : list2) {
            System.out.println(p);
        }
    }
}
