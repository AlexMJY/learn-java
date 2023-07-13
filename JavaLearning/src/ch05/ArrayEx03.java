package ch05;

public class ArrayEx03 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("변경전 - arr.length : " + arr.length);
        for (int i = 0; i < arr.length; i ++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }

        int[] tmp = new int[arr.length * 2]; // 기존 배열보다 2배인 배열 생성

        for (int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];  // arr[i]의 값을 tmp[i]에 저장
        }
        arr = tmp; // 참조변수 arr이 새로운 배열을 가리키게 한다.

        System.out.println("변경후 - arr.length : " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}
