package loops;

import java.util.Scanner;

// Check whether a number is prime number or not
public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count ++;
            }
            if(count>0)break;
        }
        System.out.println((count==0)?"Prime":"Not prime");

    }
}
