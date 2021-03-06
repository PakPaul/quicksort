package com.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(78,98,345,-63,0,762,-378,23);

        list = quicksort(list);

        System.out.println(list);
    }

    static List<Integer> quicksort (List<Integer> list){
        if ( list.size() < 2 ) return list;
        else {
            List<Integer> result = new ArrayList<>();
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            int base = list.get(0);

            for (int i = 1; i < list.size(); i++){
                if ( list.get(i) < base ) less.add(list.get(i));
                else greater.add(list.get(i));
            }

            result.addAll(quicksort(less));
            result.add(base);
            result.addAll(quicksort(greater));

            return result;
        }
    }
}
