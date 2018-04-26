package task40;

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

    public void applyPromo(Promotion promotion) {
        if (promotion.isApplicable(cart)) {
            System.out.println("Your order qualify for promo and you can pay " + promotion.apply(cart));
        }
    }


}
