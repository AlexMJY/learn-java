package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 Type Casting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.9;
        System.out.println((int) score_f);
        System.out.println((int) score_d);
        System.out.println((int) score_f + (int) score_d);

        // int + double
        score = 93 + (int) 98.6;

        score_d = (double) 93 + 98.6;

        // int -> long -> float -> double 더 큰 타입으로 갈 땐 자동 형변환
        // variable에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0 (int -> double 반대로 가면 에)

        // double -> float -> long -> int (수동 형변환)
        int convertedScoreInt = (int) score_d; // 191.6 -> 191


        // int -> String
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf((98.8));
        s2 = Double.toString(98.8);

        // String -> int
        int i = Integer.parseInt("93");
        double d = Double.parseDouble("98.8");
    }
}
