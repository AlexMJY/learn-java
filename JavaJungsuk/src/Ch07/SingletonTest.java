package Ch07;

final class Singleton {
    public static Singleton s = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}