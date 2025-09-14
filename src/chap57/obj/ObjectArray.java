package chap57.obj;

import chap54.static_.Idol;

public class ObjectArray {

    public static void main(String[] args) {
        
        Object[] objArr = new Object[] {100, "hello", 3.14, false};
        // int[] intArr = new int[] {10, 20, 30, "zzz"};
        // String[] strArr = new String[] {10, 20, 30, "zzz", "dfd"};

        int number = (int) objArr[0];
        String greeting = (String) objArr[1];

    }

}
