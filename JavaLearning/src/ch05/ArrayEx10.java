// sorting : 오른차순, 내림차순으로 배열 정렬
// bubble sorting algorithm
package ch05;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i=0; i<numArr.length; i++) {
            System.out.println(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for (int i=0; i<numArr.length; i++) {
            boolean changed = false; // 자리바꿈 체크

            for (int j=0; j<numArr.length-1-i; j++) {
                if (numArr[i] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            } // end for j

            if (!changed)
                break;

            for (int k=0; k<numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }
    }
}
