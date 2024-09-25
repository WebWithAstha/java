package controlFlow;
import java.util.Scanner;

// Accept name and age from user and and check voting validation. If not then when is Eligible
// handle all the edge cases
public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        if(age<18)
            System.out.println("Hey! "+name+" you will be eligible to vote in "+(18-age)+" years");
        else
            System.out.println("Hey! "+name+" you are a valid voter.");
    }

}
