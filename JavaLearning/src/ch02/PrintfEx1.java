package ch02;

public class PrintfEx1 {
    public static void main(String[] args) {
        /*
        printf()는 지시자(specifier)를 통해 변수의 값을 여러 형식으로 변환하여 출력할 수 있다.
        지시자는 값을 어떻게 출력할 것인지 지정하는 역할을 한다.

        ex)
        System.out.printf("age:%d year:%d", 14, 2017); // "age:14 year:2017"이 출력
        System.out.printf("age:%d", age); // 출력 후 줄바꿈을 하지 않는다.
        System.out.printf("age:%d%n", age); // 출력 후 줄바꿈을 한다.

        %b : boolean 형식으로 출력
        %d : 10진(decimal) 정수의 형식으로 출력
        %o : 8진(octal) 정수의 형식으로 출력
        %x, %X : 16진(hexa-decimal) 정수의 형식으로 출력
        %f : 부동소수점(floating-point)의 형식으로 출력
        %e, %E : 지수 표현식(exponent)의 형식으로 출력
        %c : 문자(character)로 출력
        %s : 문자열(string)로 출력
         */

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFF_FFFF_FFFF_FFFFL;

        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b); // b=1
        System.out.printf("s=%d%n", s); // s=2
        System.out.printf("c=%c, %d %n", c, (int)c); // c=A, 65
        System.out.printf("finger=[%5d]%n", finger); // finger=[   10]
        System.out.printf("finger=[%-5d]%n", finger); // finger=[10   ]
        System.out.printf("finger=[%05d]%n", finger); // finger=[00010]
        System.out.printf("finger=[%03d]%n", finger); // finger=[010]
        System.out.printf("big=%d%n", big); // big=100000000000
        System.out.printf("hex=%#x%n", hex); // hex=0xfffffffffffffff
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // hexNum=10, 16
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); //binNum=10, 2

        // 지시자 %x와 %o에 '#'를 사용하면 접두사 '0x'와 '0'이 각각 붙는다. %X는 16진수에 사용되는 접두사와 영문자를 대문자로 출력한다.

    }
}
