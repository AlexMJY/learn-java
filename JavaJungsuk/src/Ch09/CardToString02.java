package Ch09;

class Card02 {
    String kind;
    int number;

    Card02() {
        this("SPADE", 1);
    }
    
    Card02(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // Object클래스에 정의된 toString()의 접근제어가 public이기 때문에 오버라이딩 할 때 접근범위가 같거나 더 넓어야 한다
    public String toString() {  
        return "kind : " + kind + ", number : " + number;
    }
}

public class CardToString02 {
    public static void main(String[] args) {
        Card02 c1 = new Card02();
        Card02 c2 = new Card02("HEART", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}