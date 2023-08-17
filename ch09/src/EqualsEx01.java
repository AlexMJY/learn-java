public class EqualsEx01 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1 and v2 is same");
        else
            System.out.println("v1 and v2 is different");

        v2 = v1;
        if (v1.equals(v2))
            System.out.println("v1 and v2 is same");
        else
            System.out.println("v1 and v2 is different");
    }
}

class Value {
    int value;
    Value(int value) {
        this.value = value;
    }
}

/*
두 객체의 같고 다름을 참조변수의 값(주소값)으로 판단. 서로 다른 두 객체를 eqauls 메서드로 비교하면 항상 false를 결과로 얻는다.
 */
