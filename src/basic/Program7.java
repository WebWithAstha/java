package basic;
import java.util.Scanner;

// program to input dimensions of rectangle and print perimeter and area
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of the rectangle : ");
        int len = sc.nextInt();
        int wid = sc.nextInt();
        System.out.println("Perimeter is : " + (2*(len+wid)) + " and area is " +(len*wid) );
    }
}
