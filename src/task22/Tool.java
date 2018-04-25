package task22;

class Tool extends Product {
    Tool(float price) {
        super(price, 0.5f);
    }

    @Override
    float calculateGrossPrice() {
        return super.calculateGrossPrice()-1;
    }



}
