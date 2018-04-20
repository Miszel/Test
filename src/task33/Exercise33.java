package task33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise33 {

    public static void main(String[] args) {

        Set<String> productsSet = new HashSet<>();
        productsSet.add("Tool");
        productsSet.add("Another Tool");
        productsSet.add("Boiler");
        productsSet.add("Saw");
        System.out.println("set:"+productsSet);

        List<String> productsList = new ArrayList<>();
        productsList.add("Tool");
        productsList.add("Another Tool");
        productsList.add("Boiler");
        productsList.add("Saw");
        System.out.println("list"+productsList);

        searchStringInCollection(productsList, "Tool");
        searchStringInCollection(productsList, "adada");

        searchStringCollectionInListCollection(productsList, productsSet);
    }

    public static void searchStringInCollection(List<String> list, String string){
        System.out.println("you search string:"+ string);
        if(list.contains(string)) {
            System.out.println("Product list contains your string ");
        }
        else System.out.println("Product list doesn't contain your string :(");
    }

    public static void searchStringCollectionInListCollection(List<String> list, Set<String> set){
       // System.out.println("you search string:"+ string);
        if(list.contains(set)) {
            System.out.println("Product list contains your collection ");
        }
        else System.out.println("Product list doesn't contain your collection :(");
    }
}
