import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Point;

public class MyClass {
    public static void main(String[] args) {
        CSub sub = new CSub(10.0);
        System.out.println(sub.x);
        System.out.println(sub.getSuper());
        System.out.println(sub.getSub());
    }
}

class CSuper {
    public double x;
}

class CSub extends CSuper {
    public double x;

    public CSub(double new_x) {
        this.x = new_x;
        super.x = new_x * 10;
    }
    public double getSuper() {
        return super.x;
    }
    public double getSub() {
        return this.x;
    }
}