package chap54.static_;

public class Main {

    public static void main(String[] args) {

        // Idol.totalIdolCount = 100;
        Idol.COMPANY_NAME = "하이브";

        Idol.changeCompany("HYBE Company");

        Idol idol1 = new Idol("지민", "BTS");
        Idol idol2 = new Idol("태형", "BTS");
        Idol idol3 = new Idol("정국", "BTS");

        idol1.introduce();
        idol2.introduce();
        idol3.introduce();

    }

}
