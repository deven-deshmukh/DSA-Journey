package Week0.Day3;

import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of patten:");
        int n = sc.nextInt();

        /*
         * for (int i = 0; i <= n; i++) {
         * for (int j = 0; j < i; j++) {
         * System.out.print(" * ");
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = n; i > 0; i--) {
         * for (int j = 0; j < i; j++) {
         * System.out.print(" * ");
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = 0; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(" " + j + " ");
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = 0; i <= n; i++) {
         * for (int j = 0; j <= n; j++) {
         * if (i == 0 || j == 0 || i == n || j == n) {
         * System.out.print(" * ");
         * } else {
         * System.out.print("   ");
         * }
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = 0; i <= n; i++) {
         * for (int j = 0; j <= n; j++) {
         * if (i == 0 || j == 0 || i == n || j == n || j == i) {
         * System.out.print(" * ");
         * } else {
         * System.out.print("   ");
         * }
         * }
         * System.out.println();
         * }
         */

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0 || i == n || j == n || j == i) {
                    System.out.print(" " + j + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
