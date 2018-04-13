package task17;

public class Product {

    private float price;
    private float tax;

    Product(float price, float tax) {
        this.price = price;
        this.tax = tax;
    }



    public float getPrice() {
        return price;
    }
    public float getTax() {
        return tax;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }


    float calculateGrossPrice(){

        float gross = (tax*price)+price;
        System.out.println("brutto product price:" + gross);
        return gross;
    }




}

class Tool extends Product {
    Tool(float price) {
        super(price, 0.15f);
    }

}
