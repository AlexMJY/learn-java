package Ch09;

public class WrapperEx01 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i == i2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) ? " + i.compareTo(i2));
        System.out.println("i.toString() = " + i.toString());

        System.out.println("max value = " + Integer.MAX_VALUE);
        System.out.println("min value = " + Integer.MIN_VALUE);
        System.out.println("size = " + Integer.SIZE + " bits");
        System.out.println("bytes = " + Integer.BYTES + " bytes");
        System.out.println("type = " + Integer.TYPE);
    }
}
