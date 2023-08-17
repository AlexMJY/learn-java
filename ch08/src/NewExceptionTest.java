public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();  // 프로그램 설치에 필요한 준비.
            copyFiles();  // 파일들을 복사.
        } catch (SpaceException e) {
            System.out.println("error message : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 이후 다시 설치하세요.");
        } catch (MemoryException me) {
            System.out.println("error message : " + me.getMessage());
            me.printStackTrace();
            System.gc();  // garbage collections을 수행하여 메모리 늘리기.
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();  // 프로그램에 설치에 사용된 임시파일들을 삭제.
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 부족하다.");
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족하다.");
    }
    static void copyFiles() {}
    static void deleteTempFiles() {}
    static boolean enoughSpace() { return false; }
    static boolean enoughMemory() { return true; }
}

class SpaceException extends Exception {
    SpaceException(String msg) { super(msg); }
}

class MemoryException extends Exception {
    MemoryException(String msg) { super(msg); }
}