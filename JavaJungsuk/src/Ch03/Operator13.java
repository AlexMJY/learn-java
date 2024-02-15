package Ch03;

public class Operator13 {
    public static void main(String[] args) {
        char c1 = 'a';

        char c2 = (char)(c1 + 1); // (char) 캐스팅을 하지 않으면 에러 발생.
        char c3 = 'a' + 1;  // 리터럴 간의 연산이라 컴파일 에러가 발생하지 않는다.

        System.out.println(c2);
        System.out.println(c3);
    }
}
