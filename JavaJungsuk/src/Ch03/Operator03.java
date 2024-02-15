package Ch03;

public class Operator03 {
    public static void main(String[] args) {
        int i = 5, j = 5;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

/*
i는 값이 증가되기 전에 참조되므로 println()에게 i에 저장된 값 5를 넘겨주고 나서 i의 값이 증가하기 때문에 5가 출력되고,
j의 경우 값을 증가 시킨 후에 println()에 넘겨주기 때문에 6이 출력된다.
 */