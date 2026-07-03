package Week0.Day5;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isZero(n);
        System.out.println("Is " + n + " contain 0 at second position:-" + ans);
        sc.close();
    }

    static boolean isZero(int n) {
        return (abs(n) / 10) % 10 == 0;
    }

    static int abs(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
    
}