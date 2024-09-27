package controlFlow;

import java.util.Scanner;

// Accept shopped amount and return discounted amt if any
public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shopped amount : ");
        double amt  = sc.nextDouble();
        if(amt>0&&amt<=5000)
            System.out.println("Amount is : "+amt);
        else if (amt>5000 && amt<=7000) {
            System.out.println("Amount is : "+(amt*0.9));
        } else if (amt>7000 && amt<=10000) {
            System.out.println("Amount is : "+(amt*0.8));
        }else
            System.out.println("Amount is : "+(amt*.7));
    }
}
