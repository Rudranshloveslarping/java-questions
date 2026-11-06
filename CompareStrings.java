import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        System.out.println("equals: " + a.equals(b));
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(b));
        sc.close();
    }
}
