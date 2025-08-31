package chap49;

public class Idol {

    // 아이돌의 속성 : 필드
    String name;
    String groupName;

    // 생성자는 숨어있다!
    Idol(String name, String groupName) {
        // System.out.println("아이돌이 생성됨!");
        this.name = name;
        this.groupName = groupName;
    }
    Idol(String name) {
        this(name, "솔로"); // 나의 생성자 중에 다른 생성자를 호출
        // this.name = name;
        // this.groupName = "솔로";
    }   // 생성자 오버로딩

    Idol() {}

    // 아이돌의 기능 : 메서드
    void introduce() {
        System.out.println("안녕하세요! " + this.groupName + "의 " + this.name + "입니다.");
    }
    void introduce(String initMessage) {
        System.out.println(initMessage);
        this.introduce();
    }

}

class Main {
    public static void main(String[] args) {
        
        Idol chaewon = new Idol("김채원", "르세라핌");
        Idol winter = new Idol("윈터", "에스파");

        // chaewon.name = "김채원";
        // chaewon.groupName = "르세라핌";
        chaewon.introduce();

        // winter.name = "윈터";
        // winter.groupName = "에스파";
        winter.introduce();

        Idol yujin = new Idol("안유진", "아이브");
        yujin.introduce();

        // 그룹이 없는 솔로가수 아이돌
        Idol kimjongguk = new Idol("김종국");
        Idol IU = new Idol("아이유");

        kimjongguk.introduce("득근득근 근육근육!");
        IU.introduce("방가방가 헬로헬로~~ ㅋㅋㅋ");
    }
}
