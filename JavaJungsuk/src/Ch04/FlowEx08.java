package Ch04;

// 주민등록번호를 입력받아서 성별을 확인하는 프로그램

import java.util.Scanner;

public class FlowEx08 {
    public static void main(String[] args) {
        char gender;
        String regNo = "";

        System.out.print("당신의 주민번호를 입력하세요.(011231-1111222) > ");

        Scanner scanner = new Scanner(System.in);
        regNo = scanner.nextLine();

        gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                System.out.println("your sex is Male");
                break;
            case '2': case '4':
                System.out.println("your sex is Female");
                break;
            default:
                System.out.println("Invalid social security number.");
        }
    }
}
