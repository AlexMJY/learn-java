class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

public class CardToString01 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

// toString() 메서드는 인스턴스에 대한 정보를 문자열로 제공한다.
// 오버라이딩하지 않고 사용하면, 클래스이름의 16진수 해시코드를 얻는다.