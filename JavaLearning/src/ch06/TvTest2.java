package ch06;

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();  // Tv t; t1 = new Tv();를 한문장으로 생략
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경했습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
    }
}
