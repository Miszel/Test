package task26;

import java.util.ArrayList;
import java.util.List;

public class Exercise26 {


    public static void main(String[] args) {


        //List<Product> list = new ArrayList<Product>();
        List<Product> products = new ArrayList<>();
        products.add(new Product(34.6f,0.5f));
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
        products.add(new Product(34f,0.5f));

        for(int i=0; i<products.size();i++) {
            System.out.println(products.get(i));
        }


    }

}
