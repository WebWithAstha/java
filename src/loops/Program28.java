package loops;

import java.util.Scanner;

// Print factorial of n
public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        double fact = 1;
        for (int i = 2; i <=n ; i++) {
            fact*=i;
        }
        System.out.println("Factorial is : "+fact);
    }
}
