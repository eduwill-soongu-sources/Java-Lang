package chap53.abs;

public class GroupIdol extends Idol {

    private int memberCount;

    public GroupIdol(String name, String groupName, int memberCount) {
        super(name, groupName);
        this.memberCount = memberCount;
    }

    public void groupDance() {
        System.out.printf("%s의 %d명이 함께 춤을 춥니다.\n"
                , this.groupName, this.memberCount);
    }

    // 오버라이딩
    @Override
    public void perform() {
        System.out.println(name 
            + "이(가) 그룹 무대에서 화려한 공연을 합니다.");
    }

    @Override
    public void introduce() {
        
    }
}
