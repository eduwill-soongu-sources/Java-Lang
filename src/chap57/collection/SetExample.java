package chap57.collection;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        
        Set<String> foodSet = new HashSet<>();

        foodSet.add("짜장면");
        foodSet.add("탕수육");
        foodSet.add("짜장면");
        foodSet.add("볶음밥");

        System.out.println(foodSet);
    }

}
