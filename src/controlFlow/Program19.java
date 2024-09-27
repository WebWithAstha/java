package controlFlow;

import java.util.Scanner;

// Accept year and check whether it's a leap year or not
public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if ((year % 100 == 0 && year % 400 == 0) || year % 4 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not leap year");
    }
}
