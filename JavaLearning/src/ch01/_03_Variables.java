package ch01;

public class _03_Variables {
    public static void main(String[] args) {
        System.out.println("alex님 배송이 시작됩니다. 15시에 방문 예정입니다.");

        String name = "alex";
        int hour = 15;
        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");

        double score = 90.5;
        char grade = 'A'; // string이 한글자일 때
        name = "edward"; // 값을 업데이트
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요?: " + pass);

        double d = 3.14;
        float f = 3.14F; // float이 double보다 메모리 공간이 더 작아서, 정밀하게 나타내지 못한다.
        System.out.println(d);
        System.out.println(f);

        // int 1 = 1000000000000; error
        long l1 = 1000000000000L;
        long l2 = 1_000_000_000_000L; // 위와 똑같다. (가시성 향상)
    }
}
