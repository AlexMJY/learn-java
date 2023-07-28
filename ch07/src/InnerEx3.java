public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner3 {
        int iiv = outerIv;  // 외부클래스의 private멤버도 접근 가능
        int iiv2 = outerCv;
    }
    static class StaticInner3 {
        // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근 불가능
        // int siv = outerIv; // error
        static int scv = outerCv;
    }
    void myMethod() {
        int lv = 0;
        final int LV = 0; // final 생략 가능
        class LocalInner3 {
            int liv = outerIv;
            int liv2 = outerCv;
        }
    }
}
