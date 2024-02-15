package Ch08;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("error message : " + e.getMessage());
            e.printStackTrace();
            System.out.println("reinstall when space is enough");
        } catch (MemoryException e) {
            System.out.println("error message : " + e.getMessage());
            e.printStackTrace();
            System.gc(); // garbage collection
            System.out.println("reinstall");
        } finally {
            deleteTemFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 모자릅니다.");
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }
    static void copyFiles() { /* file copy code */}
    static void deleteTemFiles() { /* delete temporary files */}
    static boolean enoughSpace() { return false; }
    static boolean enoughMemory() { return true; }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException (String msg) {
        super(msg);
    }
}
