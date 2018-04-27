package task41;

public class PercentagePromotion extends AbstractPromotion {

    private final float discount;

    public PercentagePromotion(float threshold, float discount) {
        super(threshold);
        this.discount = discount;
    }

    @Override
    public float apply(Order order) {
        return order.getCartPrice() * discount;
    }
}
