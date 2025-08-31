package chap51.inherit;

// 상속의 키워드는 extends
// 하위 클래스 (sub class)
public class SoloArtist extends Idol {

    private String soloSong;

    // 생성자
    public SoloArtist(String name, String soloSong) {
        super(name, "솔로");
        this.soloSong = soloSong;
        System.out.println("솔로가수가 생성됨!");
    }

    // 단독 기능
    public void singSolo() {
        System.out.printf("%s 님이 %s 노래를 부릅니다.\n"
                , this.name, this.soloSong);
    }

    // 오버라이딩
    @Override
    public void perform() {
        System.out.println(name 
            + "이(가) 솔로 무대에서 특별한 공연을 합니다.");
    }

}
