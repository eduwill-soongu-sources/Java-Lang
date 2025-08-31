package chap50.entertainment;

public class Idol {

    private String name;
    private String groupName;

    public Idol(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }
    Idol(String name) {
        this(name, "솔로"); 
    }

    Idol() {}

    // 아이돌의 기능 : 메서드
    public void introduce() {
        System.out.println("안녕하세요! " + this.groupName + "의 " + this.name + "입니다.");
    }

    // 다른 패키지에서는 사용불가능한 default제한자
    public void introduce(String initMessage) {
        System.out.println(initMessage);
        this.introduce();
    }

    // getter 메서드
    public String getGroupName() {
        return this.groupName;
    }
    
    public String getName() {
        return name;
    }

    // setter 메서드
    // 그룹명을 변경하기 위한 메서드
    public void setGroupName(String newGroupName) {
        // setter 내부에 검증 로직을 추가할 수 있습니다.
        if (newGroupName == null || newGroupName.isEmpty()) {
            System.out.println("오류: 그룹명은 필수입니다.");
            return;
        }
        
        this.groupName = newGroupName;

        System.out.println("소속 그룹이 " + this.groupName 
                + "으로 변경되었습니다.");
    }

}

class Main {
    public static void main(String[] args) {
        
        Idol chaewon = new Idol("김채원", "르세라핌");

        // chaewon.name = "하하호호티니핑";
        // chaewon.groupName = "에스파";

        chaewon.setGroupName("아이즈원");

        System.out.println("이름: " + chaewon.getName());
        System.out.println("그룹명: " + chaewon.getGroupName());

        chaewon.introduce();

    }
}
