package task17;

public class Exercise17 {

    public static Product[] changeType() {

        String formInput = "10;2;1.5";
        String[] result = formInput.split(";");
        Product[] products = new Product[result.length];

        for (int x=0; x<result.length; x++) {

            Tool product = new Tool(Float.valueOf(result[x]));
            System.out.println("netto product price:" + product.getPrice());
            System.out.println("tax product :" + product.getTax());
            products[x] = product;
        }
        return products;
    }


    public static float calculateAverage (Product[] tab){

        float sum = 0;
        for (int i=0;i<tab.length;i++) {
            float gross = tab[i].calculateGrossPrice();
            sum+=gross;
        }
        return (float)sum/tab.length;

    }

    public static void main(String[] args) {

        Product[] table = changeType();
        float average =calculateAverage(table);
        System.out.println("average of all products:" + average);
    }

}
