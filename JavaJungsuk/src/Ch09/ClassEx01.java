package Ch09;

final class Card03 {
    String kind;
    int num;

    Card03() {
        this("SPADE", 1);
    }
    Card03(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }
    public String toString() {
        return kind + ": " + num;
    }
}

public class ClassEx01 {
    public static void main(String[] args) throws Exception {
        Card03 c = new Card03("HEART", 3);  // new연산자로 객체 생성
        Card03 c2 = Card03.class.newInstance();  // Class객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
