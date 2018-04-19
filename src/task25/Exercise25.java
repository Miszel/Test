package task25;
import java.util.Arrays;

public class Exercise25 {

    public static void main(String[] args) {

        String formInput = "4;10.5;8;7";
        String[] result = formInput.split(";");
        float[] table = changeType(result);

        Product[] products = new Product[table.length];
        for (int i = 0; i < table.length; i++) {
            Product product = new Product(table[i], 0.1f);
            System.out.println("------------------------------------------");
            System.out.println("net price of tool product is:" + " " + product.getPrice());
            System.out.println("tax price of tool product is:" + " " + product.getTax());
            System.out.println("gross price of tool product is:" + " " + product.calculateGrossPrice());
            products[i] = product;
        }

        // System.out.println(Arrays.toString(createNewArray(products, 20.5f)));

        System.out.println(Arrays.toString(removeLastElementFromArray(products)));
    }

    //zmiana tablicy stringow na tablice liczb zmiennoprz
    public static float[] changeType(String[] string) {

        float[] tabFloat = new float[string.length];
        for (int x = 0; x < string.length; x++) {
            tabFloat[x] = Float.valueOf(string[x]);
        }
        return tabFloat;
    }


    public static Product[] createNewArray(Product[] product, float price) {

        int sizeArray = getNewArrayLength(product, price);
        return createAndFillArray(product, price, sizeArray);
    }



    public static int getNewArrayLength(Product[] products, float price) {

        int newArrayLength = 0;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product.calculateGrossPrice() < price) {
                newArrayLength++;
            }
        }
        return newArrayLength;
    }


    private static Product[] createAndFillArray(Product[] product, float price, int size) {
        int index = 0;
        Product[] conditionedProducts = new Product[size];

        for (int i = 0; i < product.length; i++) {
            if (product[i].calculateGrossPrice() < price) {
                conditionedProducts[index] = product[i];
                index++;
            }
        }

        return conditionedProducts;
    }

    public static Product[] removeLastElementFromArray (Product[] products){

        Product[] arrayWithoutLastElement = new Product[products.length-1];

        for(int i=0; i<products.length-1; i++) {

            arrayWithoutLastElement[i] = products[i]
        }

        return arrayWithoutLastElement;
    }

}
