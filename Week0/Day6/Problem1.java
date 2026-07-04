package Week0.Day6;
import java.util.*;

public class Problem1 {
    public int i=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num:");
        int n = sc.nextInt();
        System.out.println("Factorial "+n+" :"+fact(n));
        sc.close();
    }

    static int fact(int n) {
        if (n == 1||n==0) {
            return 1;

        } else {
            return n * fact(n - 1);
        }
    }
}
