package Ch11;

public class Sample {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                int result = j * i;
                System.out.print(j + " * " + i + " = " + result + "\t");
            }
            System.out.println();

        }
        System.out.println();


        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                int result = j * i;
                System.out.print(j + " * " + i + " = " + result + "\t");
            }
            System.out.println();
        }
    }
}