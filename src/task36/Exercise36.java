package task36;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise36 {

    public static void main(String[] args) {

        Map<Product, Integer> cart = new HashMap<>();

        Product product1 = new Product("test1", 34.5f, 0.1f);
        Product product2 = new Product("test2", 4.5f, 0.1f);
        Product product3 = new Product("test3", 6.5f, 0.1f);
        Product product4 = new Product("test4", 3.5f, 0.1f);
        Product product5 = new Product("test5", 24.5f, 0.1f);

        cart.put(product1, 10);
        cart.put(product2, 2);
        cart.put(product3, 3);
        cart.put(product4, 4);
        cart.put(product5, 5);

        System.out.println("Mapa" + cart);

        Set<Product> products = cart.keySet();
        System.out.println(products);
        System.out.println("cartCost"+cartCost(cart));
        System.out.println("cartCost"+cartCost2(cart));

    }

        public static float cartCost(Map<Product, Integer> cart) {
        Set<Product> products = cart.keySet();
        float cost = 0f;
        for (Product product : products) {
            cost = cost + (cart.get(product) * product.calculateGrossPrice());
            System.out.println(cart.get(product) * product.calculateGrossPrice());
        }

        return cost;
        }

        public static float cartCost2(Map<Product, Integer> cart) {
        Set<Product> products = cart.keySet();
        float cost = 0f;
        for (Map.Entry<Product, Integer> entry: cart.entrySet()) {
            cost = cost + (entry.getValue() * entry.getKey().calculateGrossPrice());
            System.out.println(entry.getValue() * entry.getKey().calculateGrossPrice());
        }

        return cost;
    }
}
