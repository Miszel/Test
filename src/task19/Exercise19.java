package task19;

public class Exercise19 {
    public static void main(String[] args) {

        String formInput = "10;2.5";
        String[] result = formInput.split(";");
        float[] table = changeType(result);

        //stworzenie tablicy obiektow tool
        Tool[] tools = new Tool[table.length];

        for (int i = 0; i < table.length; i++) {
            Tool tool = new Tool(table[i]);
            System.out.println("net price of tool product is:" + " " + tool.getPrice());
            System.out.println("tax price of tool product is:" + " " + tool.getTax());
            System.out.println("gross price of tool product is:" + " " + tool.calculateGrossPrice());
            System.out.println(tool);
            tools[i] = tool;
        }
        //wyliczenie sredniej ceny brutto dla toolow
        float average1 = calculateAverage(tools);
        System.out.println("gross average of all tool products:" + average1);


        //stworzenie tablicy obiektow boiler
        Boiler[] boilers = new Boiler[table.length];
        for (int i = 0; i < table.length; i++) {
            Boiler boiler = new Boiler(table[i]);
            System.out.println("net price of bolier product is:" + " " + boiler.getPrice());
            System.out.println("tax price of bolier product is:" + " " + boiler.getTax());
            System.out.println("gross price of boiler product is:" + " " + boiler.calculateGrossPrice());
            boilers[i] = boiler;
        }
        //wyliczenie sredniej ceny brutto dla boilerow
        float average2 = calculateAverage(boilers);
        System.out.println("gross average of all boiler products:" + average2);



    }

    //zmiana tablicy stringow na tablice liczb zmiennoprz
    public static float[] changeType(String[] string) {

        float[] tabFloat = new float[string.length];
        for (int x = 0; x < string.length; x++) {
            tabFloat[x] = Float.valueOf(string[x]);
        }
        return tabFloat;
    }

    //wyliczenie sredniej z cen brutto
    public static float calculateAverage(Product[] tab) {

        float sum = 0;
        for (int i = 0; i < tab.length; i++) {
            float gross = tab[i].calculateGrossPrice();
            sum += gross;
        }
        return (float) sum / tab.length;

    }

}
