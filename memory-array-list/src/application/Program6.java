package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program6 {
    public static void main(String[] args) {
        /*
         * int x = 20;
         * Object obj = x;
         * System.out.println(obj);
         * int y = (int) obj;
         * System.out.println(y);
         */

        String[] vect = new String[] { "Maria", "Bob", "Alex" };

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-----------------------");

        for (String obj : vect) {
            System.out.println(obj);
        }

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        list.add(2, "Marco");

        System.out.println("-----------------------");
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        list.remove("Ana");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
