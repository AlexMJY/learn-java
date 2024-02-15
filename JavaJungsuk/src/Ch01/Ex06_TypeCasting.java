package Ch01;

public class Ex06_TypeCasting {
    public static void main(String[] args) {
        int score_i = 93;
        System.out.println(score_i);
        System.out.println((float) score_i);
        System.out.println((double) score_i);

        float score_f = 93.3F;
        double score_d = 93.3;
        System.out.println((int) score_f);
        System.out.println((int) score_d);
        System.out.println((int) score_f + (int) score_d);

        // int + double
        score_i = 93 + (int) 98.6;

        score_d = (double) 93 + 98.6;

        // int -> long, float -> double 처럼 더 큰 타입으로는 자동 형변환
        double convertedScoreDouble = score_i;

        int convertedScoreInt = (int) score_d;

        // int -> String
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);

        // String -> int
        int i = Integer.parseInt("93");
        double d = Double.parseDouble("99.8");

    }
}
