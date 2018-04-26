package task40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise40 {
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
        System.out.println(cart.getProductsInCartSorted());

        Customer customer = new Customer("Jan","Kowalski");
        Order order = new Order(cart,customer);
        order.placeOrder();


        Promotion promotion = new DiscountPromo();
        order.applyPromo(promotion);


    }




}
