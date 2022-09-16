package com.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {
    // Object that com.collections.maps with key value pairs
    // Duplicate keys are not allowed

    // Exceptions
    /*
        1. Null Pointer Exception -> null Object
        2. No Such Element -> get an elemnt which doesn't exist
        3. Clas Cast Exception -> Object is incompatible
        4. Unsupported Operation
    */

    // HashMap
    // Stores key and value pairs -> keys should always UNIQUE

    public void display(HashMap<String,Integer> Power){
        // Iterating the Map
        Iterator itr = Power.entrySet().iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());
            Map.Entry pair = (Map.Entry)itr.next();
            System.out.println(pair.getKey()+" -> "+pair.getValue());
        }

        System.out.println("\n");
        System.out.println("----------------");
    }


    public static void main(String[] args) {
        HashMap<String, Integer> Power = new HashMap<>();

        MapInterface obj = new MapInterface();

        // Adding elements
        Power.put("Melkor", 1);
        Power.put("Feanor", 2);
        Power.put("Fingolfin", 3);
        Power.put("Finarfin", 4);
        Power.put("Beren", 5);
        Power.put(null,10);
        Power.put(null,null);

        //  Access keys
        System.out.println("Keys: "+ Power.keySet());

        // Access Values
        System.out.println("Values: "+ Power.values());

        obj.display(Power);

        //clone
        HashMap newMap = new HashMap();
        newMap = (HashMap) Power.clone();

        System.out.println("cloned map : ");
        obj.display(newMap);

        //isEmpty
        System.out.println(Power.isEmpty());

        //size
        System.out.println(Power.size());

        //putAll
        HashMap<String, Integer> newMap2 = new HashMap();
        newMap2.put("Sauron",6);
        newMap2.putAll(Power);
        System.out.println("displaying newMap2 (putall) : ");
        obj.display(newMap2);


        //Merge= map.merge(key, newValue, function)
        Power.merge("Beren",50,(valueOld,valueNew)->valueNew/valueOld);
        System.out.println("Power map after merge");
        obj.display(Power);

        //Compute= map.compute(key, function((key,val)->anyoperation (lambda func with 2 param))
        Power.compute("Melkor",(key,value)->value*1000);
        System.out.println("Power map after compute : ");
        obj.display(Power);

        //ComputeIfAbsent= map.computeIfAbsent(key, function(lambdaFunc with one param)
        Power.computeIfAbsent("Sauron", value->500);
        Power.computeIfAbsent("Melkor",value->400);
        System.out.println("Power map after ComputeIfabsent : ");
        obj.display(Power);

        //ComputeIfPresent= map.computeIfPresent(key, function(lambdaFunc with two param)
        Power.computeIfPresent("Melkor",(key,value)->value+4000);
        Power.computeIfPresent("Galadirel", (key,value)->value-10);

        Power.computeIfPresent("Sauron",(key,value)->value+1500);
        Power.computeIfPresent("Feanor",(key,value)->value+998);
        Power.computeIfPresent("Fingolfin",(key,value)->value+1497);
        Power.computeIfPresent("Finarfin",(key,value)->value+496);
        Power.computeIfPresent("Beren",(key,value)->value+1390);
        System.out.println("Power map after ComputeIfPresent : ");
        obj.display(Power);

    }
}
