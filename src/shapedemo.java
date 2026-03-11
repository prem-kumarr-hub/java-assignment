abstract class SHAPE {
    abstract void area();
}
class Circle1 extends SHAPE {
    double radius;

    Circle1(double r) {
        radius = r;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle1 extends SHAPE {
    double length, width;

    Rectangle1(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}
public class shapedemo {
    public static void main(String[] args) {
        Circle1 c = new Circle1(5);
        Rectangle1 r = new Rectangle1(4, 6);
        c.area();
        r.area();
    }
}