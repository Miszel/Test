package task20;

public class FixedDiscountPromotion implements Promotion {

    @Override
    public float calculate(Product product) {
        //return 0;

       return product.calculateGrossPrice()-5;
    }
}
