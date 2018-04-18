package task21;

public class PercentagePromotion implements Promotion{
    @Override
    public float calculate(Product product) {

       return product.calculateGrossPrice() * 0.5f;
    }

}
