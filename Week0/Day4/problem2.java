package Week0.Day4;

import java.util.*;
//         A
//       A B A
//     A B C B A
//   A B C D C B A

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String n = sc.next();
        System.out.println();

        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n - i; j++) {
         * System.out.print(" ");
         * }
         * for (int j = 0; j <= i; j++) {
         * System.out.print((char) (65 + j) + " ");
         * }
         * for (int j = i - 1; j >= 0; j--) {
         * System.out.print((char) (65 + j) + " ");
         * }
         * System.out.println();
         * }
         */
        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < n.length() - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(n.charAt(j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(n.charAt(j));
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
