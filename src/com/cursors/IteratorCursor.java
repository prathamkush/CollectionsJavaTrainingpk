package com.cursors;


import java.util.*;

public class IteratorCursor {
    // Retrieve the data, remove some elements while traversing it.
    // iterator() method

    public static void main(String[] args) {
        List<String> empList = new LinkedList<String>();

        empList.add("Alice");
        empList.add("Bob");
        empList.add("Carol");
        empList.add("Dave");
        empList.add("Eve");

        System.out.println("Before itr,"+empList);
        Iterator<String> itr = empList.iterator();
        while (itr.hasNext()){
            String employee = itr.next();
            if(employee.equals("Bob")){
                System.out.println(employee+" ,remove");
                itr.remove();
            }

        }

        System.out.println("After itr,"+empList);



    }

}
