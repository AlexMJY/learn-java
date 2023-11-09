// 가위 바위 보 프로그램

// import java.util.Scanner;
import java.util.Scanner;;

public class FlowEx07 {
    public static void main(String[] args) {
        int user, com;

        System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 > ");

        Scanner scanner = new Scanner(System.in);
        user = scanner.nextInt();

        com = (int)(Math.random() * 3) + 1; // 1,2,3 중 하나가 com에 저장

        System.out.println("당신은" + user + "입니다.");
        System.out.println("컴퓨터는" + com + "입니다.");

        switch (user - com) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
        }
    }
}
