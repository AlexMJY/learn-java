package Ch03;

public class Operator10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;  // 1000000 * 1000000 / 1000000 (곱셈에서 이미 int의 범위를 벗어난다)
        int result2 = a / a * a;  // 1000000 / 1000000 * 1000000

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
    }
}
