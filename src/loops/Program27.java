package loops;

import java.util.Scanner;

// Print sum upto n
public class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        System.out.println("Sum upto " + n +" is : " + sum);
    }
}
