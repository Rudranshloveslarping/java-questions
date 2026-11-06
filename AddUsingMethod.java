import java.util.Scanner;

public class AddUsingMethod {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(add(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
