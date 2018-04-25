package task27;

import java.util.ArrayList;
import java.util.List;

public class Exercise27 {

    public static void main(String[] args) {


        //List<Product> list = new ArrayList<Product>();
        List<Product> products = new ArrayList<>();
        products.add(new Product(1f,0.5f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(34f,2.8f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(34f,0.2f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(6f,0.5f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(4f,0.1f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(34f,0.5f));
        products.add(new Product(2f,0.5f));

        for (Product product : products) {
            System.out.println(product);
        }
        products.remove(0);
        System.out.println("-----------------");
        for (Product product : products) {
            System.out.println(product);
        }


        Product product16 = new Product(15,1f);
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
    }

}
