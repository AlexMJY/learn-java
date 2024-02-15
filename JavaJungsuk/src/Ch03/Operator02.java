package Ch03;

public class Operator02 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        j = i++; // 후위형은 i값인 5를 먼저 읽어온 후에 i를 증가시킨다.
        System.out.println("j=i++; 실행 후, i= " + i + " ,j= " + j);

        i = 5; // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        j = 0;

        j = ++i;
        System.out.println("j=i++; 실행 후, i= " + i + " ,j= " + j);
    }
}
