package task37;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private final Map<Product, Integer> productsInCart = new HashMap<>();

    public void addProductToCart(Product product, int amount) {

        if (productsInCart.containsKey(product)) {
            productsInCart.put(product, productsInCart.get(product) + amount);
        } else {
            productsInCart.put(product, amount);
        }

    }

    public void addProductToCart(Product product) {
        addProductToCart(product, 1);

    }

    public float calculateCartPrice() {
        float cost = 0;
        for (Map.Entry<Product, Integer> entry : productsInCart.entrySet()) {
            cost = cost + entry.getKey().calculateGrossPrice() * entry.getValue();
        }

        return cost;
    }

    public Set<Product> getProductsInCart() {
        return productsInCart.keySet();
    }


    @Override
    public String toString() {
        return "Cart{" +
                "productsInCart=" + productsInCart +
                '}';
    }
}

