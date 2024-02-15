package Ch08;

public class FinallyTest02 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() {/* 프로그램 설치 코드 */}
    static void copyFiles() {/* 파일 복사 코드 */}
    static void deleteTempFiles() {/* 임시파일 삭제 코드 */}
}
