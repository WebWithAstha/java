package loops;

import java.util.Scanner;

// Print sum of odd and even numbers
public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <=n; i++) {
            if(i%2==0)
                sumEven+=i;
            else
                sumOdd+=i;
        }
        System.out.println("Sum odd " + sumOdd +"\nSum even : " + sumEven);
    }

}
