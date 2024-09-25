package controlFlow;
import java.util.Scanner;

// Program to input gender as char from user and greet respectively
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender (M/F) : ");
        char gender = sc.nextLine().charAt(0);
        if(gender == 'm' || gender == 'M')
            System.out.println("Good Morning Sir");
        else if(gender == 'f' || gender == 'F')
            System.out.println("Good Morning Ma'am");
        else
            System.out.println("Invalid input!");
    }

}
