package ch02;

public class Constant_Literal {
    public static void main(String[] args) {
        final int MAX_SPEED = 10; // 상수를 선언 & 초기화

        final int MIN_SPEED; // error. 상수는 선언과 동시에 초기화가 이뤄져야 한다.
        // final int MIN_SPEED = 100; // ok.
        // MIN_SPEED = 200; // error. 상수의 값은 변경할 수 없다.

        // 리터럴의 타입과 접미사
        int octNum = 010; // 8진수 10, 10진수로 8
        int hexNum = 0x10; // 16진수 10, 10진수로 16
        int binNum = 0b10; // 2진수 10, 10진수로 2

        long big = 100_000_000_000L; // 정수형 리터럴 중간에 구분자를 넣을 수 있다.
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        float pi = 3.14f; // 접미사 f 대신 F 가능.
        double rate = 1.618; // 접미사 d 대신 D 가능.

        double obj1 = 10.; // 10.0
        double obj2 = .10; // 0.10
        float obj3 = 10f; // 10.0f
        float obj4 = 3.14e3f; // 3140.0f
        double obj5 = 1e1; // 10.0
        double obj6 = 1e-3; // 0.001

        /*
        p는 2의 제곱을 의미하며 p의 왼쪽에는 16진수를 적고 오른쪽에는 10진수를 적는다.
        대소문자 모두 가능하며, p가 포함된 리터럴은 실수형이다.
         */
        double obj7 = 0x1p1; // (1*16^0)*2^1 = 1.0*2 = 2.0
        double obj8 = 0x12p3; // (1*16^1+2*16^0)*2^3 = (16+2)*8 = 144.0


        // 리터럴의 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용된다. 반대는 에러.
        // int obj9 = 0x123456789; // error.
        // float obj10 = 3.14; // error.

        byte obj11 = 65; // okay.
        short obj12 = 0x1235; // okay.

        // 작은 따옴표로 문자 하나를 감싼 것을 '문자 리터럴'이라고 한다.
        // 두 문자 이상은 큰 따옴표로 감싸야 하며 '문자열 리터럴'이라고 한다.
        // char은 단 하나의 문자만 저장할 수 있다. 그 이상은 String을 사용해야 한다.
        char obj13 = 'J';
        String obj14 = "Java";

        // 문자열 리터럴은 ""안에 아무런 문자도 넣지 않는 것을 허용하지만, 문자 리터럴은 ''안에 하나의 문자가 있어야 한다.
        String obj15 = ""; // okay.
        // char obj16 = ''; // error.
        char obj17 = ' '; // okay.

        // 원래 String은 클래스이므로 객체를 생성하는 연산자 new를 사용해야 하지만 위와 같은 표현도 혀용한다.
        String obj18 = new String("Java"); // String 객체 생성

        // 덧셈 연산자를 이용하여 문자열을 결합할 수 있어서 아래와 같이 사용할 수도 있다.
        // 덧셈 연산자는 피연산자가 모두 숫자일 때는 두 수를 더하지만, 어느 한 쪽이 String이면 나머지 한쪽도 String으로 변환한 다음 결합한다.
        String obj19 = "Ja" + "va"; // obj19 = "Java
        String obj20 = obj19 + 8.0; // obj20 = "Java8.0"

    }
}
