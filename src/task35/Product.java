package task35;

import java.util.Objects;

public class Product {

    private float price;
    private float tax;
    private String name;

    Product(String name, float price, float tax){
        this.name = name;
        this.price = price;
        this.tax = tax;

    }

    public String getName() {return name;}
    public float getPrice() {
        return price;
    }
    public float getTax() {
        return tax;
    }


    public void setName(String name) {
        this.price = price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setTax(float tax) {
        this.tax = tax;
    }


    float calculateGrossPrice(){

        float gross = (tax*price)+price;
        //System.out.println("brutto product price:" + gross);
        return gross;
    }


    @Override
    public String toString() {
        return "Product:"+" "+getName()+ "with price " + getPrice() + " and tax of " + getTax();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}






