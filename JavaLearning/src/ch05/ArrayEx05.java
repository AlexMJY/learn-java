// 총합과 평균

package ch05;

public class ArrayEx05 {
    public static void main(String[] args) {
        int sum = 0; // total score
        float average = 0f; // average score

        int[] score = {100, 88, 100, 100, 90};

        for (int i : score) {
            sum += i;
        }
        average = sum / (float)score.length; // type casting

        System.out.println("total score : " + sum);
        System.out.println("average score : " + average);
    }
}
