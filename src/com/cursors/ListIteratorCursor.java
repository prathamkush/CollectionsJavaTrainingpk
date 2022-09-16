package com.cursors;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


// Can have all CRUD Ops
// Both Forward and Backward direction
// Specify an index position to target input stream element


public class ListIteratorCursor {

    public static void main(String[] args) {
        List<String> empList = new LinkedList<String>();

        empList.add("Alice");
        empList.add("Bob");
        empList.add("Carol");
        empList.add("Dave");
        empList.add("Eve");

        ListIterator<String> listfront = empList.listIterator();

        System.out.println("Checking the employee list forward direction :");
        while (listfront.hasNext()){
            String empName = listfront.next();
            System.out.println(empName);
        }

        ListIterator<String> listback = empList.listIterator(empList.size());
        System.out.println("Checking the employee list backward direction :");
        while(listback.hasPrevious()){
            String empName = listback.previous();
            System.out.println(empName);
        }

        // CRUD from front
        listfront = empList.listIterator();
        System.out.println("[CRUD front] Changing the employee list : ");
        while(listfront.hasNext()){
            String empName = listfront.next();

            // Create/add
            if(empName.equalsIgnoreCase("bob")){
                listfront.add("Bobby");
            }

            // Update/set
            if(empName.equalsIgnoreCase("Alice")){
                listfront.set("Alice Stark");
            }

            // Delete/remove
            if(empName.equalsIgnoreCase("Eve")){
                listfront.remove();
            }
            System.out.println(empName);
        }


        System.out.println("---------------------");

        empList.clear();

        empList.add("Alice");
        empList.add("Bob");
        empList.add("Carol");
        empList.add("Dave");
        empList.add("Eve");




        // CRUD from back
        listback = empList.listIterator(empList.size());
        System.out.println("[CRUD back]Changing the employee list : ");
        while(listback.hasPrevious()){
            String empName = listback.previous();

            // Create/add
            if(empName.equalsIgnoreCase("bob")){
                listback.add("Bobby");
            }

            // Update/set
            if(empName.equalsIgnoreCase("Alice")){
                listback.set("Alice Stark");
            }

            // Delete/remove
            if(empName.equalsIgnoreCase("Eve")){
                listback.remove();
            }
            System.out.println(empName);
        }




    }
}
