package Week0.Day4;

import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println();
        /*
         * for (int i = 0; i < str.length(); i++) {
         * for (int j = 0; j < str.length(); j++) {
         * if (i == j) {
         * System.out.print(str);
         * }
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = 0; i < str.length(); i++) {
         * for (int j = 0; j < str.length(); j++) {
         * System.out.print(str.charAt(i));
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = 0; i <= str.length(); i++) {
         * for (int j = 0; j < i; j++) {
         * System.out.print(" " + str.charAt(j));
         * }
         * System.out.println();
         * }
         */

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}
