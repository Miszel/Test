package task22;

public class Exercise22 {
    public static void main(String[] args) {

        String formInput = "4;10.5";
        String[] result = formInput.split(";");
        float[] table = changeType(result);

        Tool[] tools = new Tool[table.length];
        for (int i = 0; i < table.length; i++) {
            Tool tool = new Tool(table[i]);
            System.out.println("------------------------------------------");
            System.out.println("net price of tool product is:" + " " + tool.getPrice());
            System.out.println("tax price of tool product is:" + " " + tool.getTax());
            System.out.println("gross price of tool product is:" + " " + tool.calculateGrossPrice());
            tools[i] = tool;
        }

        Boiler[] boilers = new Boiler[table.length];
        for (int i = 0; i < table.length; i++) {
            Boiler boiler = new Boiler(table[i]);
            System.out.println("------------------------------------------");
            System.out.println("net price of bolier product is:" + " " + boiler.getPrice());
            System.out.println("tax price of bolier product is:" + " " + boiler.getTax());
            System.out.println("gross price of tool product is:" + " " + boiler.calculateGrossPrice());
            boilers[i] = boiler;
        }

        conditionCheck(tools, 6f);
        conditionCheck(boilers, 6f);

    }

    //zmiana tablicy stringow na tablice liczb zmiennoprz
    public static float[] changeType(String[] string) {

        float[] tabFloat = new float[string.length];
        for (int x = 0; x < string.length; x++) {
            tabFloat[x] = Float.valueOf(string[x]);
        }
        return tabFloat;
    }

    public static void conditionCheck(Product[] product, float price) {
        for (int x = 0; x < product.length; x++) {
            if (product[x].calculateGrossPrice() < price) {
                System.out.println(product[x]+" is with price lesser than" +" "+ price);
            }

        }

    }
}
