package basic;
import java.util.Scanner;

// Program to print age first then name from user
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        // dummy/flush line to handle Enter or Space
        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+"! you are "+age+" years old.");
    }
}


