class Outer5 {
    int value = 10;  // Outer.this.value

    class Inner5 {
        int value = 20;  // this.value
        void method1() {
            int value = 30;
            System.out.println("           value : " + value);
            System.out.println("      this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer5.this.value);
        }
    }  // end of Innerclass
}  // end of Outerclass
public class InnerEx5 {
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        Outer5.Inner5 inner = outer.new Inner5();
        inner.method1();
    }
} // end of InnerEx5