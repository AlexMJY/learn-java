// 1과 10사이의 숫라를 출력하되 그 중에서 3의 배수인 것은 제외

package ch04;

public class FlowEx31 {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
