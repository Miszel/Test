package task23;

import java.util.Arrays;

public class Exercise23 {
    public static void main(String[] args) {

        String formInput = "4;10.5;8";
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

        System.out.println(Arrays.toString(conditionCheck(products, 9f)));
        System.out.println(Arrays.toString(conditionCheck(products, 20.5f)));

    }

    //zmiana tablicy stringow na tablice liczb zmiennoprz
    public static float[] changeType(String[] string) {

        float[] tabFloat = new float[string.length];
        for (int x = 0; x < string.length; x++) {
            tabFloat[x] = Float.valueOf(string[x]);
        }
        return tabFloat;
    }

    public static Product[] conditionCheck(Product[] product, float price) {
        int y = 0;
        int i = 0;
        for (int x = 0; x < product.length; x++) {
            if (product[x].calculateGrossPrice() < price) {
                y++;
            }

        }

        Product[] conditionedProducts = new Product[y];
        for (int x = 0; x < product.length; x++) {
            if (product[x].calculateGrossPrice() < price) {
                   conditionedProducts[i] = product[x];
                   i++;
                 }
            }

        return conditionedProducts;
    }

}