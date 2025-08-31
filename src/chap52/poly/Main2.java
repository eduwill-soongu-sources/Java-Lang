package chap52.poly;

import chap51.inherit.*;

public class Main2 {

    public static void main(String[] args) {
        
        Idol iu = new SoloArtist("아이유", "분홍신");
        Idol chaewon = new GroupIdol("김채원", "르세라핌", 5);
        SoloArtist jongguk = new SoloArtist("김종국", "한남자");
        GroupIdol sakura = new GroupIdol("사쿠라", "르세라핌", 5);

        iu.introduce();
        iu.perform();

        if (iu instanceof SoloArtist) {
            SoloArtist castIu = (SoloArtist)iu;
            castIu.singSolo();
        }
        

        System.out.println("=====================");
        chaewon.introduce();
        chaewon.perform();

        if (chaewon instanceof GroupIdol) {
            GroupIdol castChaewon = (GroupIdol)chaewon;
            castChaewon.groupDance();
        }
    }
}
