/*
16진수를 2진수로 변환하는 예제. 변환하고자 하는 16진수를 배열 hex에 나열한다. 16진수에는 6개의 문자가 포함되므로 char로 처리하였다.
bianry에는 16개의 예제 값을 저장한다. for문을 이용해서 hex에 저장된 문자를 하나씩 읽어서 그에 해당하는 이진수 표현을 binary에서 얻어
result에 덧붙이고 결과를 화면에 출력한다.
 */
package ch05;

public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'};
        String[] binary = {"0000", "0001", "0010", "0011"
                          ,"0100", "0101", "0110", "0111"
                          ,"1000", "1001", "1010", "1011"
                          ,"1100", "1101", "1110", "1111"};
        StringBuilder result = new StringBuilder();
//        for (int i=0; i<hex.length; i++) {
//            if (hex[i] >= '0' && hex[i] <= '9') {
//                result += binary[hex[i] - '0'];
//            } else {
//                result += binary[hex[i] - 'A' + 10];
//            }
//        }

        for (char c : hex) {
            if (c >= '0' && c <= '9') {
                result.append(binary[c - '0']);
            } else {
                result.append(binary[c - 'A' + 10]);
            }
        }
        System.out.println("hex: " + new String(hex));
        System.out.println("binary: " + result);
    }
}
