package basic;
import java.util.Scanner;

// program to input parameters and print compound interest
// C = (p(1+r/n)^nt)  - P // r is in percent => r =  r/100
// for n=1
// C = P(1+r)t - P
public class Program8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal, rate, time");
        int p = sc.nextInt();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        System.out.println("Compound interest is : " + ((p * Math.pow((1+(r/100)),t)) - p));
    }
}
