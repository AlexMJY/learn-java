package ch02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.123456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // f1=0.100000, 1.000000e-01, 0.100000
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); // f2=10.000000, 1.000000e+01, 10.0000
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); // f3=3140.000000, 3.140000e+03, 3140.00

        System.out.printf("d=%f%n", d); // d=1.123457
        System.out.printf("d=%14.10f%n", d); // d=  1.1234567890

        System.out.printf("[12345678901234567890]%n"); // [12345678901234567890]
        System.out.printf("[%s]%n", url); // [www.codechobo.com] (문자열의 길이만큼 출력공간 확보)
        System.out.printf("[%20s]%n", url); // [   www.codechobo.com] (최소 20글자 출력공간 확보. 우측정렬)
        System.out.printf("[%-20s]%n", url); // [www.codechobo.com   ] (최소 20글자 출력공간 확보. 좌측정렬)
        System.out.printf("[%.8s]%n", url); // [www.code] (왼쪽에서 8글자만 출력)


        // 실수형 값의 출력에 사용되는 지시자는 %f, %e %g가 있는데 %f가 주로 쓰이고 %e는 지수형태로 출력할 때, %g는 값을 간략하게 표현할 때 사용한다.
        // %f는 기본적으로 소수점 아래 6자리까지만 출력하기 때문에 소수점 아래 7자리에서 반올림한다. 아래와 같이 전체 자리 수와 소수점 아래의 자리수를 지정할 수도 있다.
        System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 아래 10자리까지 출력
    }
}
