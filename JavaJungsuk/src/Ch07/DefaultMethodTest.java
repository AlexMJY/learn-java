package Ch07;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child6 c = new Child6();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child6 extends Parent6 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1 () in Child");
    }
}
class Parent6 {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}
interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }
    default void method2() {
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in Myinterface");
    }
}
interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
