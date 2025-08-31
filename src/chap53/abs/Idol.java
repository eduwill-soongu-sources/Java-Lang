package chap53.abs;

// 추상 클래스
public abstract class Idol {

    // 공통 속성
    protected String name; 
    protected String groupName;

    // 부모의 생성자
    protected Idol() {
    }

    protected Idol(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    // 공통 기능
    // 추상 메서드
    public abstract void introduce();

    public abstract void perform();

}
