class EncapsulatedStudent {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulatedStudent s = new EncapsulatedStudent();
        s.setName("Rudransh");
        s.setAge(19);
        System.out.println(s.getName() + " " + s.getAge());
    }
}
