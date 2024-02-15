package Ch11;

import java.util.*;

public class StackEx01 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.Nate");
        goURL("2.yahoo");
        goURL("3.Naver");
        goURL("4.Daum");

        printStatus();

        goBack();
        System.out.println("= enter the Back Button =");
        printStatus();

        goBack();
        System.out.println("= enter the Back Button =");
        printStatus();

        goFoward();
        System.out.println("= enter the Forward Button = ");
        printStatus();

        goFoward();
        System.out.println("= enter the Forward Button = ");
        printStatus();


    }

    public static void printStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        System.out.println("present window '" + back.peek());
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if (!forward.empty())
            forward.clear();
    }
    public static void goFoward() {
        if (!forward.empty())
            back.push(forward.pop());
    }
    public static void goBack() {
        if (!back.empty())
            forward.push(back.pop());
    }
}
