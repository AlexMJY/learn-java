package ch03;

public class Operator18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // round 메서드는 매개변수로 받은 값을 소수점 첫째자리에서 반올림하고 결과를 정수로 돌려주는 메서드다.

        System.out.println(shortPi);
    }
}
