class Rectangle {
    double length, breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleClass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5;
        r.breadth = 3;
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}
