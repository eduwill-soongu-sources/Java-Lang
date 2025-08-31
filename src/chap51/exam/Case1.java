package chap51.exam;


class Parent {
    int a = 1;
}
class Child extends Parent {
    int a = 2;

    Child(int a) {
        super.a = this.a = a;
    }

    void print() {
        System.out.println("this.a = " + this.a);
        System.out.println("super.a = " + super.a);
    }
}


public class Case1 {

    public static void main(String[] args) {
        
        Child c= new Child(5);
        c.print();
    }
}
