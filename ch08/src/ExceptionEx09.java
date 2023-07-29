public class ExceptionEx09 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e;
            // throw new Exception("고의로 발생시켰음"); // 위의 두 줄을 생략 가능
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program is over");
    }
}
