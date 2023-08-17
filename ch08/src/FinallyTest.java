public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTemplates();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTemplates();
        }
    }
    static void startInstall() { /* 프로그램 설치에 필요한 준비를 하는 코드 */ }
    static void copyFiles() { /* 파일들을 복사하는 코드 */ }
    static void deleteTemplates() { /* 임시파일들을 삭제하는 코드 */ }
}
