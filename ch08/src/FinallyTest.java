public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();
        }
    }
    static void startInstall() { /* 프로그램 설치 코드*/}
    static void copyFiles() {}
    static void deleteTempFiles() {}
}
