package program1.util;

import java.util.function.Predicate;

import program1.entities.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p1) {
        return p1.getPrice() >= 100.0;
    }

}
