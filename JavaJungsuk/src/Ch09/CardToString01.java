package Ch09;

// toString을 오버라이딩하지 않고 호출하면 클래스 이름에 16진수의 해시코드를 리턴한다

class Card01 {
    String kind;
    int number;

    Card01() {
        this("Spade", 1);
    }
    Card01(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}


public class CardToString01 {
    public static void main(String[] args) {
        Card01 c1 = new Card01();
        Card01 c2 = new Card01();
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
