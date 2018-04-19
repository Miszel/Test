package task29;

import java.util.ArrayList;
import java.util.List;

public class Exercise29 {


    public static void main(String[] args) {

        //List<Product> list = new ArrayList<Product>();
        List<Product> products = new ArrayList<>();
        products.add(new Product(1f, 0.5f));
        products.add(new Product(34f, 0.5f));
        products.add(new Product(34f, 0.5f));
        products.add(new Product(34f, 2.8f));
        products.add(new Product(34f, 0.5f));
        products.add(new Product(34f, 0.5f));
        products.add(new Product(2f, 0.5f));

        for (Product product : products) {
            System.out.println(product);
        }
        products.remove(0);
        System.out.println("-----------------");
        for (Product product : products) {
            System.out.println(product);
        }


        Product product16 = new Product(15, 1f);
        products.add(product16);
        System.out.println("-----------------");
        for (Product product : products) {
            System.out.println(product);
        }

        products.remove(product16);
        System.out.println("-----------------");
        for (Product product : products) {
            System.out.println(product);
        }


        List<Product> anotherList = new ArrayList<>();
        anotherList.add(new Product(13f, 0.5f));

        products.addAll(anotherList);

        System.out.println("-----------------");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("-----------------");
        for (Product product : anotherList) {
            System.out.println(anotherList);
        }


        products.clear();
        System.out.println("AFTER CLEAR-----------------");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("-----------------");
        for (Product product : anotherList) {
            System.out.println(anotherList);
        }


        products.add(0, new Product(15, 1f));

        System.out.println("AFTER ADD-----------------");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("-----------------");
        for (Product product : anotherList) {
            System.out.println(anotherList);
        }


        System.out.println(products.isEmpty());
        products.set(0, new Product(8, 0.1f));
        System.out.println("AFTER set-----------------");
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
