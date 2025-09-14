package chap58.anonymous;

import java.util.Comparator;

// 나이 오름차 기준으로 정렬하기 위한 기준 클래스
public class AgeComparator implements Comparator<Idol> {

    @Override
    public int compare(Idol o1, Idol o2) {
        return o1.getAge() - o2.getAge();
    }

}
