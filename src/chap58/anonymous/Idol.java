package chap58.anonymous;

public class Idol {

    private String name;
    private int age;

    public Idol(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이 %d세"
        , name, age);
    }

}
