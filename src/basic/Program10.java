package basic;
import java.util.Scanner;

// program to print surface area of sphere
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere : ");
        int rad = sc.nextInt();
        System.out.println("Surface area is : "+(4*Math.PI*rad*rad));

    }
}
