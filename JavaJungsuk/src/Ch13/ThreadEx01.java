package Ch13;

public class ThreadEx01 {
    public static void main(String[] args) {
        ThreadEx01_1 t1 = new ThreadEx01_1();

        Runnable r = new ThreadEx01_2();
        Thread t2 = new Thread(r);  // 생성자 Thread(Runnable target)
    }
}


class ThreadEx01_1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()); // 조상인 Thread의 getName() 호출
        }
    }
}

class ThreadEx01_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}