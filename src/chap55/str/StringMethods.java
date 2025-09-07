package chap55.str;

public class StringMethods {
    public static void main(String[] args) {
        String song = "Butter - BTS";

        // 1. 길이 구하기
        System.out.println("길이: " + song.length()); // 12

        // 2. 특정 위치의 문자
        System.out.println("첫 번째 문자: " + song.charAt(0)); // 'B'

        // 3. 부분 문자열 추출
        System.out.println("앞 6글자: " + song.substring(0, 6)); // "Butter"
        System.out.println("7번째부터 끝까지: " + song.substring(7)); // "- BTS"

        // 4. 문자열 검색
        System.out.println("BTS 위치: " + song.indexOf("BTS")); // 9
        System.out.println("존재 여부: " + song.contains("BTS")); // true

        // 5. 문자열 치환
        String newSong = song.replace("BTS", "방탄소년단");
        System.out.println("치환 후: " + newSong); // "Butter - 방탄소년단"

        // 6. 대소문자 변환
        System.out.println("대문자: " + song.toUpperCase()); // "BUTTER - BTS"
        System.out.println("소문자: " + song.toLowerCase()); // "butter - bts"

        // 7. 공백 제거
        String text = "  Hello World  ";
        System.out.println("공백 제거: '" + text.trim() + "'"); // "Hello World"

        // 8. 문자열 분할
        String[] parts = song.split(" - ");
        System.out.println("제목: " + parts[0]); // "Butter"
        System.out.println("아티스트: " + parts[1]); // "BTS"
    }
}
