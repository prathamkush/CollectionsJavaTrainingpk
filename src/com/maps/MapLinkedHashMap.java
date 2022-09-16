package com.maps;


import java.util.LinkedHashMap;


public class MapLinkedHashMap { //Maintains the insertion order(synchronized)

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> Power = new LinkedHashMap<>();

        MapLinkedHashMap obj = new MapLinkedHashMap();

        // Adding elements
        Power.put("Melkor", 1);
        Power.put("Feanor", 2);
        Power.put("Fingolfin", 3);
        Power.put("Finarfin", 4);
        Power.put("Beren", 5);
        Power.put(null,10);
        Power.put(null,null);
        Power.put(null,11);

        System.out.println("LinkedHashmap : "+Power);
    }





}
