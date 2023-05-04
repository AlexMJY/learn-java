package ch03;

public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a'; // a의 유니코드 값인 97이 저장된다.
        char c2 = c1; // c1에 저장되어 있는 값이 저장된다.
        char c3 = ' '; // 공백으로 초기화.

        int i = c1 + 1; // 'a'=1 -> 91+1 -> 98

        c3 = (char)(c1 + 1);
        c2++;
        c2++;

        System.out.println("i="+i);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);
    }
}
