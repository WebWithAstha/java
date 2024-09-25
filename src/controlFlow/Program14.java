package controlFlow;
import java.util.Scanner;

// Program to input gender as char from user and greet respectively
// handle all the edge cases
public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender (M/F) : ");
        String inp = sc.nextLine();
        char gender = inp.charAt(0);
        if(inp.length() > 1)
            System.out.println("Wrong input !");
        else if(gender == 'm' || gender == 'M')
            System.out.println("Good Morning, Sir.");
        else if(gender == 'f' || gender == 'F')
            System.out.println("Good Morning, Ma'am.");
        else
            System.out.println("Wrong input");
    }

}
