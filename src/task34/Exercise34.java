package task34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise34 {

    public static void main(String[] args) {

        Set<Product> productsSet = new HashSet<>();
        Product product1 = new Product(10f, 01f);
        Product product2 = new Product(45f, 02f);
        Product product3 = new Product(8f, 0.1f);
        Product product4 = new Product(3f, 0.5f);
        productsSet.add(product1);
        productsSet.add(product2);
        productsSet.add(product3);
        productsSet.add(product4);
        System.out.println("set:"+productsSet);



        searchProductInCollection(productsSet, new Product(3f,01f));
        searchProductInCollection(productsSet,product3);


    }

    public static void searchProductInCollection(Set<Product> productCollection, Product product){
        System.out.println("you search product:"+ product);
        if(productCollection.contains(product)) {
            System.out.println("Product collection contains your product");
        }
        else {
            System.out.println("Product collection doesn't contain your product :(" )
        }
    }


}
