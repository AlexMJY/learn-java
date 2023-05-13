package ch04;

import java.util.Scanner;

public class FlowEx06_2 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());

        if (month == 3 || month == 4 || month == 5) {
            System.out.println("현재의 계절은 봄입니다.");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("현재의 계절은 여름입니다.");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("현재의 계절은 가을입니다.");
        } else {
            System.out.println("현재의 계절은 겨울입니다.");
        }
    }
}
