class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Animal a = new Dog();
        a.eat();

        if (a instanceof Dog) {

            Dog d = (Dog) a;
            d.bark();

        } else {

            System.out.println("Not a Dog, cannot downcast safely");
        }
    }
}