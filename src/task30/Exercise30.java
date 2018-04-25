package task30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise30 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        Product product1 = new Product(13f,0.5f);
        productsList.add(product1);
        productsList.add(product1);
        productsList.add(product1);

        System.out.println("List:");
       for (Product product : productsList)
        System.out.println(product);
//        UCZ SIĘ KAROLINA!!!!!
        Set<Product> productsSet = new HashSet<>();
        productsSet.add(product1);
        productsSet.add(product1);
        productsSet.add(product1);
        System.out.println("Set:");
        for (Product product : productsSet)
            System.out.println(product);


    }
}
