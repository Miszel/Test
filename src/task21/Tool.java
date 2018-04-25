package task21;

class Tool extends Product {
    Tool(float price) {
        super(price, 0.5f);
    }

    @Override
    float calculateGrossPrice() {
        return super.calculateGrossPrice()-1;
    }

    @Override
    public String toString() {
        return "Product with price " + getPrice() + " and tax of " + getTax();
    }

}
