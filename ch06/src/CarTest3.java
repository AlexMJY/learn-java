class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4);
    }

    Car3(Car3 c) { // 인스턴스의 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class CarTest3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1); // c1의 복사본 c2 생성

        System.out.println("c1 color = " + c1.color + ", c1 gearType = " + c1.gearType + ", c1 door = " + c1.door);
        System.out.println("c2 color = " + c2.color + ", c2 gearType = " + c2.gearType + ", c2 door = " + c1.door);
        c1.door = 100;
        System.out.println("c1 color = " + c1.color + ", c1 gearType = " + c1.gearType + ", c1 door = " + c1.door);
        System.out.println("c2 color = " + c2.color + ", c2 gearType = " + c2.gearType + ", c2 door = " + c2.door);
    }
}
