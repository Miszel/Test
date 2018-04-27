package task41;

import java.util.List;

public class Order {
    private final Cart cart;
    private final Customer customer;
    private float cartPrice;

    public Order(Cart cart, Customer customer) {
        this.cart = cart;
        this.customer = customer;
        this.cartPrice=cart.calculateCartPrice();
    }

    public float getCartPrice() {
        return cartPrice;
    }

    public void placeOrder() {
        cartPrice = cart.calculateCartPrice();
        System.out.println("Klient " + customer + " zlozyl zamowienie na laczna cene " + cartPrice);

    }

    public void applyPromotions(List<Promotion> promotion) {
        for (Promotion promo : promotion) {
            if (promo.isApplicable(cart)) {
                cartPrice = promo.apply(this);
                System.out.println("Your order qualify for promo and you can pay " + cartPrice);

            }
        }

    }
}
