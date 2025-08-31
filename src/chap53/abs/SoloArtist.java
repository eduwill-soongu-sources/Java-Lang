package chap53.abs;

public class SoloArtist extends Idol {

    // 아이돌이면 반드시 자기소개기능과 공연하기 기능이 필수다!!
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

    @Override
    public void introduce() {
        
    }
}
