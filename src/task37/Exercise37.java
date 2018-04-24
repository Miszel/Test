package task37;

import java.util.HashSet;
import java.util.Set;

public class Exercise37 {

    public static void main(String[] args) {

        Product product1 = new Product("test1",15f,0.1f);
        Product product2 = new Product("test2",5f,0.1f);
        Product product3 = new Product("test3",1f,0.1f);
        Product product4 = new Product("test4",2f,0.1f);

       Cart cart = new Cart();
        cart.addProductToCart(product1,2);
        cart.addProductToCart(product1,4);
        cart.addProductToCart(product1);
        cart.addProductToCart(product2,4);
        cart.addProductToCart(product2,1);



        System.out.println("cart cost:"+" "+cart.calculateCartPrice());
        System.out.println(cart.getProductsInCart());

    }



}

