package task15;

public class Product {
    float price;
    float tax;



    Product(float price, float tax) {
        this.price = price;
        this.tax = tax;
    }


    float calculateGrossPrice(){

        float gross = (tax*price)+price;
        System.out.println("brutto product price:" + gross);
        return gross;
    }

}
