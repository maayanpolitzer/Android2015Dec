package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
                // key & value
        HashMap<String, Integer> map = new HashMap<>();

        map.put("maayan", 123);
        map.put("moshe", 246);

        // insert data:
        map.put("mb", 456);
        map.put("rrr", 7);
        map.put("rrr", 8);

        //print:
        System.out.println(map);

        //remove:
        map.remove("moshe");
        map.remove("svflsdfvnslvn"); //  do nothing...

        //get:
        map.get("maayan");
        map.containsKey("maayan");

        //loop:
        Set<String> keys = map.keySet();        // {"maayan", "moshe"}
        Iterator<String> iterator = keys.iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            map.put(key, map.get(key) + 1000000);
        }

        System.out.println(map);



    }
}
