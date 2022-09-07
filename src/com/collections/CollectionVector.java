package com.collections;
import java.util.*;
public class CollectionVector {
    public void display(Vector<String> str){
        Iterator <String> itr = str.iterator();
        int index=0;
        while(itr.hasNext()) {
            System.out.println(index +" " +itr.next());
            index++;
        }
        System.out.println("--------");
    }
    public static void main(String[] args) {
        CollectionVector obj = new CollectionVector();
        // Vector
        Vector<String> vec = new Vector<>();
        // add
        vec.add("1");
        vec.add("2");
        vec.add("3");
        vec.add("4");
        vec.add("5");
        vec.add("6");
        // display
        obj.display(vec);

        //void add
        vec.add(3,"3");

        //contains
        System.out.println(vec.contains("10"));

        //remove
        vec.remove("2");
        obj.display(vec);

        //indexOfObject
        System.out.println("First index of 3 ->"+vec.indexOf("3"));
        //lastIndexOf
        System.out.println("Last index of 3 -> "+vec.lastIndexOf("3"));

        //clear
        vec.clear();
        System.out.println(vec.size());



    }
}