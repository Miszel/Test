package task41;

public abstract class AbstractPromotion implements Promotion {
    private final float threshold;


    public AbstractPromotion(float threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean isApplicable(Cart cart) {
        return cart.calculateCartPrice() > threshold;
    }
}
