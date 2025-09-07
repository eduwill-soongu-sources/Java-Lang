package chap55.str;

public class StringTest {
    public static void main(String[] args) {
        
        // 리터럴 방식 - String pool 활용 (재활용)
        String name1 = "지민";
        String name2 = "지민";

        // new 키워드 방식 - 새로운 객체 생성
        String name3 = new String("지민");
        String name4 = new String("지민");

        System.out.println("name1 == name2: " + (name1 == name2)); // true
        System.out.println("name3 == name4: " + (name3 == name4)); // false
        System.out.println("name1 == name3: " + (name1 == name3)); // false

        System.out.println("==============");

        System.out.println("name1.equals(name2): " + (name1.equals(name2)));
        System.out.println("name3.equals(name4): " + (name3.equals(name4)));
        System.out.println("name1.equals(name3): " + (name1.equals(name3)));

    }
}
