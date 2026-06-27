package Week0.Day1;

/* write a program to calculate the ticket price for a movie theater based on the age of the customer and the day of the week.
 The base price is $10 for adults (age 18 and above) and $8 for children (below age 18).
  On Wednesdays, there is a $2 discount on the ticket price. 
  The program should prompt the user to enter their age and the day of the week, then output the final ticket price. */
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
        sc.close();
    }

}
