package com.cursors;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

    //  1. Retrieve Elements one by one from a collection
    //  2. Enums specifying input streams -> sequence input stream
    //  3. elements() method enumeration

    public static void main(String[] args) {
        Vector<String> empList = new Vector<>();

        empList.add("Alice");
        empList.add("Bob");
        empList.add("Carol");
        empList.add("Dave");
        empList.add("Eve");

        Enumeration<String> enm = empList.elements();

        while (enm.hasMoreElements()){
            String emoloyee = enm.nextElement();
            System.out.println(emoloyee);
        }







    }
}
