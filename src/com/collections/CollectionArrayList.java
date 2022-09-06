package com.collections;
import java.sql.SQLOutput;
import java.util.*;

public class CollectionArrayList {
    public static void main(String[] args) {
        //al object of class ArrayList
        ArrayList al = new ArrayList();
        //boolean add
        //Appending/adding to the array list
        al.add("Feanor");
        al.add("Fingolfin");
        al.add("Finarfin");

        System.out.println("asdfasdf");

        //void add
        al.add(1, "Sauron");
        al.add("Sauron");


        // itr object of interface Iterator
        Iterator itr = al.iterator();


        while(itr.hasNext()){
            System.out.println(itr.next());
        }// beginitr->pratham->kushwah->kasrawad

        //clone
        ArrayList newArray = new ArrayList();
        newArray = (ArrayList) al.clone();
        System.out.println("--------");
        System.out.println(newArray);

        //trimToSize
        newArray.trimToSize();

        System.out.println("----+----");

        //toArray
        Object[] newAarray2 = al.toArray();
        for(Object o : newAarray2){
            System.out.print(o + " ");
        }
        System.out.println("\n");

        //lastindexof
        int index = al.lastIndexOf("Sauron");
        System.out.println(index);

        al.clear();
        System.out.println(al.size());






















    }
}
