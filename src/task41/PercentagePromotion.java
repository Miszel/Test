package task41;

public class PercentagePromotion extends AbstractPromotion{

    private final float discount;

    public PercentagePromotion(float threshold, float discount) {
       super(threshold);
        this.discount = discount;
    }

    @Override
    public float apply(Cart cart) {
        return cart.calculateCartPrice()*discount;
    }
}
