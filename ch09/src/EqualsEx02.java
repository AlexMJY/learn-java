class Person {
    long id;

    public boolean equals(Object obj) {  // overriding
        if (obj instanceof Person)
            return id == ((Person)obj).id; // obj가 Object타입이므로 id값을 참조하기 위해서는 형변환이 필요.
        else
            return false;  // 타입이 Person이 아니면 값을 비교할 필요도 없다.
    }
    Person(long id) {
        this.id = id;
    }
}

public class EqualsEx02 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1 == p2)
            System.out.println("p1 and p2 is same");
        else
            System.out.println("p1 and p2 is different");

        if (p1.equals(p2))
            System.out.println("p1 and p2 is same");
        else
            System.out.println("p1 and p2 is different");
    }
}

// equals 메서드를 오버라이딩해서 참조값이 아닌 Value값을 비교하도록 바꿨다.