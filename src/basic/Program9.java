package basic;
import java.util.Scanner;

// program to print area of triangle using herons formula
public class Program9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        double s = (s1+s2+s3)/2;
        System.out.println("Area is : " + (Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)))));
    }
}
