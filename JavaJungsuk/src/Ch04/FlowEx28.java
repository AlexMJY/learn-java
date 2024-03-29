package Ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100 사이의 정수를 입력하세요 > ");

            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }
}

// 1과 100 사이의 임의의 수를 변수 answer에 저장하고, 이 값을 맞출 때까지 반복하는 프로그램.
// 두 값이 같으면 반복을 벗어난다.