// String클래스의 toString()은 String인스턴스가 갖고 있는 문자열을 반환하도록 오버라이딩 되어있다 (Date, File ...)

public class ToStringTest01 {
    public static void main(String[] args) {
        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());
    }
}