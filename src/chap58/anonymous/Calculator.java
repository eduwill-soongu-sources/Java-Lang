package chap58.anonymous;

@FunctionalInterface
public interface Calculator {
    // 2개의 정수로 연산하는 기능 명세
    int operate(int n1, int n2);
}
