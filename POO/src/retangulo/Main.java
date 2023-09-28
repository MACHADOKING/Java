package retangulo;

import java.util.Locale;
import java.util.Scanner;

import retangulo.entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        rectangle.area(width, height);
        rectangle.perimeter(width, height);
        rectangle.diagonal(width, height);
        System.out.println("Area = " + rectangle.area);
        System.out.println("Perimeter = " + rectangle.perimeter);
        System.out.println("Diagonal = " + rectangle.diagonal);

        sc.close();
    }
}
