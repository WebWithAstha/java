package loops;

import java.util.Scanner;

// Print all factors of n
public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0)
                sum+=i;
                System.out.print(i + " + ");
        }
        System.out.println(n +" = "+(sum+n));
    }
}
