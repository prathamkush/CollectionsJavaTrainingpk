package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSet {
    public void display(TreeSet<String> ts){
        Iterator<String> itr = ts.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("\n");
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        CollectionTreeSet obj = new CollectionTreeSet();

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Melkor");
        ts.add("Feanor");
        ts.add("Fingolfin");
        ts.add("Finarfin");
        ts.add("Feanor");


        obj.display(ts);


        //remove
        ts.remove("Melkor");
        System.out.println("After removing Melkor");
        obj.display(ts);

        //contains
        ts.contains("Sauron");

        //clone
        TreeSet newTreeSet = new TreeSet();
        newTreeSet = (TreeSet) ts.clone();

        System.out.println("cloned set is");
        obj.display(newTreeSet);


        //clear
        ts.clear();

        //size and isEmpty
        System.out.println("size of TreeSet -> " + ts.size());
        System.out.println(ts.isEmpty());

    }
}
