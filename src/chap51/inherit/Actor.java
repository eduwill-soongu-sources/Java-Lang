package chap51.inherit;

public class Actor extends Idol {

    // 설계도 (클래스) 내부에 생성자를 만들지 않으면??
    // -> 기본 생성자가 생성됨
    public Actor(String name) {
        // 생성자의 첫줄에 this(), super()를 사용하지 않으면??
        // -> 자동으로 첫줄에 super()가 삽입됨!!
        // super(name, "배우");
        System.out.println("배우 객체가 생성됨!");
    }

}
