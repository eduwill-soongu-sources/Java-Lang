package chap52.poly;

import chap51.inherit.*;

public class Main {

    public static void main(String[] args) {
        
        SoloArtist iu = new SoloArtist("아이유", "분홍신");
        GroupIdol chaewon = new GroupIdol("김채원", "르세라핌", 5);
        SoloArtist jongguk = new SoloArtist("김종국", "한남자");
        GroupIdol sakura = new GroupIdol("사쿠라", "르세라핌", 5);

        Idol[] idols = {iu, chaewon, jongguk, sakura};

        for (Idol idol : idols) {
            idol.perform();
        }


        // SoloArtist[] idols1 = {iu, jongguk, new SoloArtist("Jennie", "Mantra")};

        // for (SoloArtist soloArtist : idols1) {
        //     soloArtist.perform();
        // }

        // GroupIdol[] idols2 = {chaewon, sakura};

        // for (GroupIdol groupIdol : idols2) {
        //     groupIdol.perform();
        // }

        System.out.println("======================");

        ConcertManager cm = new ConcertManager();
        cm.startConcert(jongguk);

    }
}
