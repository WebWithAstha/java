package loops;
import java.util.Scanner;

// Print reverse numbers from n to 1
public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n =  sc.nextInt();
        for(int i  = n; i>0;i--){
            System.out.println(i);
        }
    }
}
