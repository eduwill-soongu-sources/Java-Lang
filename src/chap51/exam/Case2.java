package chap51.exam;


class Parent3 {
    public Parent3() {
        print();
    }
    public void print() { System.out.println("P:" + v); }
    int v = 10;
}

class Child3 extends Parent3 {
    int v = 20;
    public Child3() {
        v = 30;
    }
    @Override
    public void print() { System.out.println("C:" + v); }
}


public class Case2 {
    public static void main(String[] args) {
        new Child3();
    }
}


