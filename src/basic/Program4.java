package basic;
import java.util.Scanner;


// program to swap 2 numbers with temp variable
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 =  sc.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Swapped number are : "+num1 +" & "+num2);
    }
}
