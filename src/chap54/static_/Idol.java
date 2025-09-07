package chap54.static_;

class SoloArtist extends Idol {

    @Override
    public void introduce() {
        // ...
    }

}

public class Idol {

    // 인스턴스 필드 (각 객체마다 별도로 메모리를 차지)
    public String name;
    private final String groupName; 

    // 정적 필드 (모든 객체가 공유하는 데이터)
    public static int totalIdolCount;
    public static final String COMPANY_NAME;

    private static final double TAX_RATE;

    // static 블록 - 정적 초기화자
    static {
        System.out.println("스태틱 블록 호출!");
        totalIdolCount = 0;
        COMPANY_NAME = "HYBE";
        TAX_RATE = 0.1;
        System.out.println(TAX_RATE);
    }

    public Idol() {}

    public Idol(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;

        totalIdolCount++;
    }

    public void introduce() {
        System.out.printf("안녕하세요! %s소속 %s의 %s입니다.\n"
        , COMPANY_NAME, groupName, name);
        System.out.printf("현재 총 %d명의 아이돌이 있습니다.\n"
        , totalIdolCount);
    }
    // 정적 메서드 : 객체 생성없이 호출가능
    public static void changeCompany(String newCompany) {
        // COMPANY_NAME = newCompany;
        System.out.println("소속사가 변경되었습니다.");
    }

}
