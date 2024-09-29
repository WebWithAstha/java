package loops;
import java.util.Scanner;

// Accept integer and print Hello world n times
public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n =  sc.nextInt();
        for(int i  = 0; i<n;i++){
            System.out.println("Hello World");
        }
    }
}
