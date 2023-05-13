package ch04;

import java.util.Scanner;

public class FlowEx08 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요. (011231-1111222) > ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7); // 입력받은 번호의 8번째 인덱스 문자

        switch (gender) {
            case '1': case '3':
                System.out.println("Your a Male");
                break;
            case '2': case '4':
                System.out.println("Your a Female");
                break;
            default:
                System.out.println("Invalid social security number.");
        }
    }
}
