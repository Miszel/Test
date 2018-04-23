package task35;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Exercise35 {

    public static void main(String[] args) {
        Product product = new Product("Irwin Jack 880 Universal Hand Saw", 12f, 0.1f);

        System.out.println(product);

        Set<Product> products = new HashSet<>();
        Product screw = new Product("Screw", 5, 0.1f);
        products.add(screw);
        System.out.println(products.contains(screw));

        products.add(new Product("Screw", 5, 0.1f));
        products.add(new Product("Screw", 5, 0.1f));
        products.add(new Product("Screw", 5, 0.1f));
        products.add(new Product("Screw", 50, 0.1f));
        System.out.println(products);
        System.out.println(products.contains(new Product("Screw", 55, 0.1f)));



    }

}
