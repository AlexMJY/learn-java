package ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.println(10 < x && x < 20); // true

        x = 6;
        System.out.println(x % 2 == 0 || x % 3 == 0 && x % 6 != 0); // true

        System.out.println((x % 2 == 0 || x % 3 == 0) && x % 6 != 0); // false

        ch = '1';
        System.out.println('0' <= ch && ch <= '9'); // true

        ch = 'a';
        System.out.println('a' <= ch && ch <= 'z'); // true

        ch = 'A';
        System.out.println('A' <= ch && ch <= 'Z'); // true

        ch = 'q';
        System.out.println(ch == 'q' || ch == 'Q'); // true
    }
}
