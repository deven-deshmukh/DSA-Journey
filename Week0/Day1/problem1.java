package Week0.Day1;

import java.util.*;

public class problem1 {

    public static void main(String[] args) {
        int age, price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AGE of the customer: ");
        age = sc.nextInt();
        System.out.println("Enter Day of the week: ");
        String day = sc.next();
        if (age >= 18) {
            price = 10;
        } else {
            price = 8;
        }

        if (day.equals("wednesday") || day.equals("Wednesday") || day.endsWith("WEDNESDAY")) {
            price = price - 2;
        }
        System.out.println("The ticket price is: $" + price);
    }

}
