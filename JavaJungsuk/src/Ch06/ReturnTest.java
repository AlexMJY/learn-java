package Ch06;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3, 5, result2);
        System.out.println(result2[0]);
    }
    int add(int a, int b) {
        return a + b;
    }

    // 반환값이 없어도 메서드의 실행결과를 얻어올 수 있다.
    // 메서드는 하나의 값을 리턴할 수 있지만 아래의 방법을 응용하면 여러 값을 반환할 수 있다.
    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }

}
