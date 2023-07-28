package ch04;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("Enter your score > ");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        switch (score / 10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        } // end of switch
        System.out.println("your grade is " + grade);
    }
}
