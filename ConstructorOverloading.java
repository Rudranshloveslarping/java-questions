class Box {
    int length, breadth;

    Box() {
        length = 1;
        breadth = 1;
    }

    Box(int l, int b) {
        length = l;
        breadth = b;
    }

    void show() {
        System.out.println("Area = " + (length * breadth));
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box a = new Box();
        Box b = new Box(4, 5);
        a.show();
        b.show();
    }
}
