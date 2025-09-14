package chap57.generic;

public class Main {

    public static void main(String[] args) {
        
        // // 사과바구니 - 사과만 모아서 담고 싶어요!
        // AppleBox appleBox = new AppleBox();
        // appleBox.setApple(new Apple());
        // // appleBox.setApple(new Grape());

        // Apple apple = appleBox.getApple();

        // // 포도바구니 - 포도만 모아서 담고 싶어요!
        // GrapeBox grapeBox = new GrapeBox();
        // grapeBox.setGrape(new Grape());

        // Grape grape = grapeBox.getGrape();

        //=============================

        Box<Apple> appleBox = new Box<>();

        appleBox.setFruit(new Apple());

        Apple apple = appleBox.getFruit();

        Box<Grape> grapeBox = new Box<>();

        grapeBox.setFruit(new Grape());

        Grape grape = grapeBox.getFruit();

    }
}
