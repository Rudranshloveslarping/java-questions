class Student {
    String name;
    int rollNumber;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentClassObject {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rudransh";
        s.rollNumber = 86;
        s.marks = 85.5;
        s.display();
    }
}
