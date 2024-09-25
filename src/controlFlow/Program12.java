package controlFlow;
import java.util.Scanner;

// Program to input 2 numbers and print the greatest
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2)
            System.out.println("Greatest is : "+num1);
        else
            System.out.println("Greatest is : "+num2);
    }
}
