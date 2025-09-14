package chap57.generic;

// 제네릭 박스 - 일단 박스를 그냥만들고 나중에 어떤과일을 담을지 결정
// <F> - 제네릭 타입 : 나중에 결정되는 타입
public class Box<F> {

    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }

}
