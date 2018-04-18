package task21;

public class Exercise21 {

    public static void main(String[] args) {

        String formInput = "10;10.5";
        String[] result = formInput.split(";");
        float[] table = changeType(result);
        Promotion promotion = new FixedDiscountPromotion();
        Promotion promotion2 = new PercentagePromotion();

        //stworzenie tablicy obiektow tool
        Tool[] tools = new Tool[table.length];

        for (int i = 0; i < table.length; i++) {
            Tool tool = new Tool(table[i]);
            System.out.println("------------------------------------------");
            System.out.println("net price of tool product is:" + " " + tool.getPrice());
            System.out.println("tax price of tool product is:" + " " + tool.getTax());
            //System.out.println("gross price of tool product is:" + " " + tool.calculateGrossPrice());

            //System.out.println("gross price of tool after fixed promotion:" + " " + promotion.calculate(tool));
            System.out.println("calcualtion for fixed promo:");
            applyPromotion(promotion,tool);
            System.out.println("calcualtion for percentage promo:");
            applyPromotion(promotion2,tool);
           // System.out.println(tool);
            tools[i] = tool;
        }

        //stworzenie tablicy obiektow boiler
        Boiler[] boilers = new Boiler[table.length];
        for (int i = 0; i < table.length; i++) {
            Boiler boiler = new Boiler(table[i]);
            System.out.println("------------------------------------------");
            System.out.println("net price of bolier product is:" + " " + boiler.getPrice());
            System.out.println("tax price of bolier product is:" + " " + boiler.getTax());
            //System.out.println("gross price of boiler product is:" + " " + boiler.calculateGrossPrice());
            //System.out.println("gross price of tool after fixed promotion:" + " " + promotion.calculate(boiler));
            System.out.println("calcualtion for fixed promo:");
            applyPromotion(promotion,boiler);
            System.out.println("calcualtion for percentage promo:");
            applyPromotion(promotion2,boiler);
            boilers[i] = boiler;
        }


    }

    //zmiana tablicy stringow na tablice liczb zmiennoprz
    public static float[] changeType(String[] string) {

        float[] tabFloat = new float[string.length];
        for (int x = 0; x < string.length; x++) {
            tabFloat[x] = Float.valueOf(string[x]);
        }
        return tabFloat;
    }


    public static void applyPromotion(Promotion promotion, Product product) {
        System.out.println("gross price of product before promo is:" + " " + product.calculateGrossPrice());
        System.out.println("gross price of product after promotion applied:" + " " + promotion.calculate(product));
    }

}
