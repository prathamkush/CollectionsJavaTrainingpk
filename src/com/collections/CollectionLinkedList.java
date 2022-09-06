package com.collections;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList<String>();

        // Null->Melkor->Feanor->Fingolfin->Finarfin->---
        ll.add("Melkor");
        ll.add("Feanor");
        ll.add("Fingolfin");
        ll.add("Finarfin");
        ll.add(3,"Beren");
        ll.add("Feanor");
        ll.addFirst("Illuvatar");
        ll.addLast("Sauron");


        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("---------------------");


        System.out.println(ll.getFirst());
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));
        System.out.println(ll.indexOf("Feanor"));
        System.out.println(ll.lastIndexOf("Feanor"));
        System.out.println(ll.contains("Sauron"));
        System.out.println(ll.peekFirst());

        ll.removeLastOccurrence("Feanor");
        //System.out.println(ll);
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i) + " ");
        }


    }
}
