package ch05;

public class ArrayEx03 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // 배열 arr에 1~5를 저장
        for (int i=0; i<5; i++) {
            arr[i] = i + 1;
        }

        System.out.println("[변경 전]");
        System.out.println("arr.length: " + arr.length);
        for (int i=0; i<arr.length; i++)
            System.out.println("arr[" + i + "]: " + arr[i]);

        int[] tmp = new int[arr.length * 2];

        // arr에 저장된 값들을 tmp에 복사
        for (int i=0; i<arr.length; i++)
            tmp[i] = arr[i];
        arr = tmp;

        System.out.println("[변경 후]");
        System.out.println("arr.length: " + arr.length);
        for (int i=0; i<arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}
