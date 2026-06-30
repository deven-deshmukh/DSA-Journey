package Week0.Day2;

// write a program to take the input from user a date and check the days in the month of that date.
import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (dd/mm/yyyy): ");
        String date = sc.next();
        String[] parts = date.split("/");
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        // System.out.println("Month: " + month + ", Year: " + year);
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 0;
                System.out.println("Invalid month");
        }
        System.out.println("The number of days in the month is: " + days);
        sc.close();
    }
}
