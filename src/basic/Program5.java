package basic;

import java.util.Scanner;

// Program to swap 2 number without temp variable
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " " + num2);
    }
}
