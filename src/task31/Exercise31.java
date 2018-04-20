package task31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise31 {


        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<>();

            Product product1 = new Product(13f,0.5f);
            productsList.add(product1);
            productsList.add(product1);
            productsList.add(product1);

            System.out.println("List:");
            for (Product product : productsList)
                System.out.println(product);

            Set<Product> productsSet = new HashSet<>();
            productsSet.add(product1);
            productsSet.add(product1);
            productsSet.add(product1);
            System.out.println("Set:");
            for (Product product : productsSet)
                System.out.println(product);

            productsSet.addAll(productsList);
            System.out.println("--------");
            for (Product product : productsSet)
                System.out.println(product);

        }
}
