package task40;

public class DiscountPromo implements Promotion {

    @Override
    public boolean isApplicable(Cart cart) {
        return cart.calculateCartPrice() > 120;
    }

    @Override
    public float apply(Cart cart) {
        return cart.calculateCartPrice()-10;
    }


}
