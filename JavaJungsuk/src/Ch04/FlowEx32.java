package Ch04;

// 메뉴를 보여주고 선택하는 프로그램. 메뉴를 잘못 선택한 경우, continue문으로 다시 메뉴를 보여주고, 종료(0)를 선택한경우 break로 반복을 벗어나는 프로그램
import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)  > ");

            menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
                continue;
            }

            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
        }
    }
}
