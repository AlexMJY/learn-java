public class Operator09 {
    public static void main(String[] args) {
        long a = 1000000 * 1000000; // overflow
        long b = 1000000 * 1000000L;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
