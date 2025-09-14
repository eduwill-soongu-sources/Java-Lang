package chap57.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("apple", "사과");
        dictionary.put("train", "기차");
        dictionary.put("code", "프로그램코드");
        dictionary.put("diary", "일기");

        System.out.println(dictionary);
        System.out.println(dictionary.size());
    }
}
