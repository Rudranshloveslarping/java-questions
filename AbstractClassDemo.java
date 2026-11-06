abstract class AnimalType {
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends AnimalType {
    void sound() {
        System.out.println("Meow");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.sleep();
    }
}
