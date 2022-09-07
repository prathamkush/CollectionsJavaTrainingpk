package maps;

import java.util.TreeMap;

public class MapTreeMap { //cant have null values and SORT the elements by key

    public static void main(String[] args) {
        TreeMap<String, Integer> Power = new TreeMap<>();

        MapTreeMap obj = new MapTreeMap();

        // Adding elements

        Power.put("Feanor", 2);
        Power.put("Fingolfin", 3);
        Power.put("Melkor", 1);
        Power.put("Finarfin", 4);
        Power.put("Beren", 5);


        System.out.println("Power : "+Power);
    }



}
