package chap58.anonymous;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        List<Idol> idolList = new ArrayList<>();
        idolList.add(new Idol("김채원", 26));
        idolList.add(new Idol("사쿠라", 28));
        idolList.add(new Idol("허윤진", 25));
        idolList.add(new Idol("카즈하", 23));
        idolList.add(new Idol("홍은채", 20));

        System.out.println("정렬전: ");
        for (Idol idol : idolList) {
            System.out.println(idol);
        }

        // 정렬
        System.out.println("=================");

        // Collections.sort(idolList, new Comparator<Idol>() {
        //     @Override
        //     public int compare(Idol o1, Idol o2) {
        //         return o1.getAge() - o2.getAge();
        //     }
        // });

        Collections.sort(idolList, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println("정렬 후: ");
        for (Idol idol : idolList) {
            System.out.println(idol);
        }


        Runnable task1 = () -> System.out.println("동시작업 1111");
        
        new Thread(task1).start();


        Calculator addCal = (n1, n2) -> n1 + n2;

        System.out.println("=============");
        System.out.println(addCal.operate(50, 30));

    }

}
