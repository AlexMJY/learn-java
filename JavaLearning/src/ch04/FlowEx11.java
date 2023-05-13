package ch04;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.println("Enter your social security number > ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                switch (gender) {
                    case '1':
                        System.out.println("you are a man born before 2000");
                        break;
                    case '3':
                        System.out.println("you are a man born after 2000");
                }
                break;
            case '2': case '4':
                switch (gender) {
                    case '2':
                        System.out.println("you are a woman born before 2000");
                        break;
                    case '4':
                        System.out.println("you are a woman born after 2000");
                        break;
                }
                break;
            default:
                System.out.println("Invalid social security number");
        }
    }
}
