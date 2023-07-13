package ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        // 사용자로부터 반복해서 숫자를 입력받아가 0을 입력하면 입력을 마치고 총 합을 출력하는 프로그램
        int num;
        int sum = 0;
        boolean flag = true;

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0 입력)");

        while (flag) {
            System.out.print(">> ");

            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계: " + sum);
    }
}
