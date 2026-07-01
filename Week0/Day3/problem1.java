package Week0.Day3;

import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        /*
         * for (int i = 2; i < n; i = i * i) {
         * System.out.println(i);
         * }
         */
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c != 0) {
            System.out.println(n + "it is not prime");
        } else {
            System.out.println(n + "it is prime");

        }
        sc.close();
    }
}
