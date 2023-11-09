public class EqualsEx01 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1 and v2 is same");
        } else {
            System.out.println("v1 and v2 is different");
        }

        v2 = v1;

        if (v1.equals(v2)) {
            System.out.println("v1 and v2 is same");
        } else {
            System.out.println("v1 and v2 is different");
        }
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}

/*
 Object 클래스로부터 상속받은 equals 메서드는 두 개의 참조변수가 같은 객체를 참조하고 있는지, 즉 두 참조변수에 저장된 값(주소값)이
 같은지를 판단하는 기능밖에 할 수 없다. value를 비교하기 위해선 Value 클래스에서 equals메서드를 오버라이딩하여 변경해야 한다.
 */