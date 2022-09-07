package com.collections;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {

    public void display(LinkedHashSet<String> lhs){
        Iterator<String> itr = lhs.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("\n");
        System.out.println("----------------");
    }


    public static void main(String[] args) {
        // Order of elements intact
        // Doubly linked list across all elements

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        CollectionLinkedHashSet obj = new CollectionLinkedHashSet();

        lhs.add("Melkor");
        lhs.add("Feanor");
        lhs.add("Fingolfin");
        lhs.add("Finarfin");
        lhs.add("Feanor");
        lhs.add(null);

        obj.display(lhs);

        lhs.contains("Sauron");


        // size, clear
        System.out.println(lhs.size());
        lhs.clear();

        //isEmpty
        System.out.println(lhs.isEmpty());



    }
}
