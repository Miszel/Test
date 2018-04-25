package task38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise38 {

    public static void main(String[] args) {

        Product product1 = new Product("test1", 15f, 0.1f);
        Product product2 = new Product("test3", 5f, 0.1f);
        Product product3 = new Product("test2", 5f, 0.1f);


        Cart cart = new Cart();
        cart.addProductToCart(product1, 2);
        cart.addProductToCart(product1, 4);
        cart.addProductToCart(product3);
        cart.addProductToCart(product2, 4);
        cart.addProductToCart(product2, 1);
        cart.addProductToCart(product3, 1);


        System.out.println("cart cost:" + " " + cart.calculateCartPrice());
        System.out.println(cart.getProductsInCart());

        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(cart.getProductsInCartsorted());


    }
}
