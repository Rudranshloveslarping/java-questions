import java.util.Scanner;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (char ch : s.toCharArray())
            count++;
        System.out.println("Length = " + count);
        sc.close();
    }
}
