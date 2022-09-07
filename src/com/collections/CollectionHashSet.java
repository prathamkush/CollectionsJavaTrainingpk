package com.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class CollectionHashSet {

    public void display(HashSet<String> sett) {
        Iterator<String> itr = sett.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-----------");
    }



    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        CollectionHashSet obj = new CollectionHashSet();


        //Allows null values
        // Doesnt allow duplicates
        // Iteration order of elements is not guaranteed
        // Constant time performance (add, remove, contains and size
        hs.add("Melkor");
        hs.add("Feanor");
        hs.add("Fingolfin");
        hs.add("Finarfin");
        hs.add("Feanor");
        hs.add(null);

        obj.display(hs);
        //remove
        hs.remove("Melkor");

        //contains
        hs.contains("Sauron");

        //clone
        HashSet newSet = new HashSet();
        newSet = (HashSet) hs.clone();

        System.out.println("cloned set is");
        obj.display(newSet);


        //clear
        hs.clear();

        //size and isEmpty
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());




    }
}
