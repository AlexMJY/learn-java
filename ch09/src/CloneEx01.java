class Point implements Cloneable {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();  // clone()은 반드시 예외처리를 해야 한다.
        } catch (CloneNotSupportedException e) {}
        return obj;
    }
}

public class CloneEx01 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point)original.clone();  // 복제(clone)해서 새로운 객체 생성
        System.out.println(original);
        System.out.println(copy);

    }
}


// clone()은 원래의 인스턴스는 보존하고 새로운 인스턴스를 생성해서 값을 복사한다.
// Cloneable 인터페이스를 구현한 클래스의 인스턴스만 clone()을 통한 복제가 가능한데, 인스턴스의 데이터를 보호하기 위해서이다.
// Cloneable 인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미다.