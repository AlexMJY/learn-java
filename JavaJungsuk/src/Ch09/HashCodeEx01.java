package Ch09;

public class HashCodeEx01 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));  // String은 문자열이 같으면 true로 출력되도록 오버라이딩 되어있다
        
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // identityHashCode는 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
