package task41;

import java.util.List;

public class Order {
    private final Cart cart;
    private final Customer customer;

    public Order(Cart cart, Customer customer) {
        this.cart = cart;
        this.customer = customer;
    }


    public void placeOrder() {
        System.out.println("Klient " + customer + " zlozyl zamowienie na laczna cene " + cart.calculateCartPrice());

    }

    public void applyPromotions(List<Promotion> promotion) {
        if (promotion.isApplicable(cart)) {
            System.out.println("Your order qualify for promo and you can pay " + promotion.apply(cart));
        }
    }


}
