package chap56;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫번째 숫자: ");
            int n1 = sc.nextInt();

            System.out.print("두번째 숫자: ");
            int n2 = sc.nextInt();

            System.out.println("결과: " + (n1 / n2));
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("원인: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자로만 입력하세요!! 제발요");
        } finally {
            System.out.println("짝짝짝!!");
        }

        System.out.println("계산기가 정상 종료되었습니다.");

    }

}
