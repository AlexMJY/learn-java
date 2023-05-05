package ch03;

public class OperatorEx29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;

        System.out.println(toBinaryString(p));
        System.out.println(toBinaryString(~p));
        System.out.println(toBinaryString(~p+1));
        System.out.println(toBinaryString(~~p));
        System.out.println();
        System.out.println(n);
        System.out.println(~(n-1));
    } // main

    static String toBinaryString(int x) {
        String zero = "000000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);

    }
}
