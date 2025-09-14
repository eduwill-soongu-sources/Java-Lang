package chap57.collection;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        
        List<String> foods = new ArrayList<>();

        foods.add("짜장면");
        foods.add("탕수육");
        foods.add("볶음밥");

        System.out.println(foods);

        foods.remove(1);
        System.out.println(foods);

        System.out.println("===============");
        // for (int i = 0; i < foods.size(); i++) {
        //     System.out.println(foods.get(i)); // foods[i]
        // }

        for (String food : foods) {
            System.out.println(food);
        }

    }

}
