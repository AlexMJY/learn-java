package Ch07;

class Product {
    int price;  // 제품의 가격
    int bonusPoint;  // 제품 구매 시 제공하는 보너스 점수
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);  // 보너스 점수는 제품 가격의 10%
    }
}

class Tv3 extends Product {
    Tv3 () {
        // 조상클래스의 생성자 Product(int price)를 호출
        super(100);  // Tv의 가격을 100만원으로 설정
    }
    // Object 클래스의 toString()을 오버라이딩
    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() { super(200);}
    public String toString() { return "Computer"; }
}

class Buyer {  // 고객
    int money = 1000;  // 소유금액
    int bonusPoint = 0;  // 보너스 점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를(을) 구입했습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv3());
        b.buy(new Computer());

        System.out.println("현재 남은 잔액은 " + b.money + "만원입니다.");
        System.out.println("현재 보너즈 점수는 " + b.bonusPoint + "입니다.");
    }
}