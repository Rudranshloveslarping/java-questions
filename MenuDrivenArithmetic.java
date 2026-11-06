import java.util.Scanner;

public class MenuDrivenArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        int choice = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b != 0)
                    System.out.println((double) a / b);
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
