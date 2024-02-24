package Ch04;

import java.util.Scanner;

public class FlowEx04 {
    public static void main(String[] args) {
        int score = 0; // 점수 저장 변수
        char grade = ' '; // 학점 저장 변수. 공백으로 초기화

        System.out.print("점수를 입력하세요 > ");
        Scanner scanner = new Scanner(System.in);
        score = Integer.parseInt(scanner.nextLine());

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}