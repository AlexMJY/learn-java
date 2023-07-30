import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        // 어떤 수를 10으로 나머지 연산하면 마지막 자리를 얻을 수 있다. 그리고 10으로 나누면 마지막 한자리가 제거된다.
        int num = 0;
        int sum = 0;

        System.out.print("숫자를 입력하세요. (예. 12345)  > ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            // num을 10으로 나눈 나머지를 sum에 더함
            sum += num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}