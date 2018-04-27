package task41;

public class DiscountPromo extends AbstractPromotion {

    private final float discount;

    public DiscountPromo(float threshold, float discount) {
        super(threshold);
        this.discount = discount;
    }


    @Override
    public float apply(Cart cart) {
        return cart.calculateCartPrice() - discount;
    }


}
