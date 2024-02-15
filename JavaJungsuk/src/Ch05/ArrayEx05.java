package Ch05;

// 총합과 평균: 배열의 모든 요소를 더해서 총합과 평균 구하는 프로그램

public class ArrayEx05 {
    public static void main(String[] args) {
        int sum = 0; // 총점 저장
        float average = 0f; // 평균 저장

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("Total Score" + score);
        System.out.println("Average Score" + average);
    }
}
