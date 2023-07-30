class Product {
    static int count = 0;  // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serailNo; // 인스턴스의 고유 번호

    {
        ++count;
        serailNo = count;  // Product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serailNo에 저장
    }
    public Product() {} // 기본 생성자, 생략 가능
}
public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1 serial no is " + p1.serailNo);
        System.out.println("p2 serial no is " + p2.serailNo);
        System.out.println("p3 serial no is " + p3.serailNo);
        System.out.println("Total number of product is " + Product.count);
    }
}