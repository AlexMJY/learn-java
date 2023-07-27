package ch07;

import java.util.*;

class Product5 {
    int price;
    int bonusPoint;

    Product5(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product5() {
        price = 0;
        bonusPoint = 0;
    } // 기본 생성자
}

class Tv5 extends Product5 {
    Tv5() { super(100); }
    public String toString() { return "Tv"; }
}

class Computer5 extends Product5 {
    Computer5() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio5 extends Product5 {
    Audio5() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer5 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product5 p) {
        if (money < p.price) {
            System.out.println("You can't buy something because your balance is low.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println("Buy " + p);
    }
    void refund(Product5 p) {  // 구입한 제품 환불
        if (item.remove(p)) {  // 제품을 Vector에서 제거
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "is Refunded");
        } else {
            System.out.println("None of the products you purchased are available.");
        }
    }
    void summary() {
        int sum = 0;  // 구입한 물품의 가격 합계
        String itemList = "";  // 구입한 물품 목록

        if (item.isEmpty()) {
            System.out.println("None of the product");
            return;
        }

        // 반복문을 이용해 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.size(); i++) {
            Product5 p = (Product5) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총 금액은" + sum + " 입니다.");
        System.out.println("구입하신 제품은 " + itemList + " 입니다.");

    }
}
public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer5 b = new Buyer5();
        Tv5 t = new Tv5();
        Computer5 c = new Computer5();
        Audio5 a = new Audio5();

        b.buy(t);
        b.buy(c);
        b.buy(a);
        b.summary();
        System.out.println();
        b.refund(c);
        b.summary();
    }
}
