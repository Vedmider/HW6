package com.HW6;

import java.util.*;

public class Counter {

    public static Map<Integer, Integer> count (List<Integer> integerList){
        Map<Integer, Integer> integerRepetitionsMap = new HashMap<>();

        for (Integer integer : integerList){
            if(integerRepetitionsMap.containsKey(integer)){
                integerRepetitionsMap.put(integer, integerRepetitionsMap.get(integer) + 1);
            } else {
                integerRepetitionsMap.put(integer, 1);
            }
        }
        return integerRepetitionsMap;
    }

}
