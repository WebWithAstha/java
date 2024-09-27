package controlFlow;

import java.util.Scanner;

// Accept electricity bill amt and print the final(after discounting)
public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units : ");
        int unit =  sc.nextInt();
        if(unit>=0 && unit<101)
            System.out.println("Amt is : "+(unit*4.2));
        else if (unit<201)
            System.out.println("Amt is : "+(420 + (unit-100)*6));
        else if (unit<401)
            System.out.println("Amt is : "+(1020 + (unit-200)*8));
        else
            System.out.println("Amt is : "+(2620 + (unit-400)*13));

    }
}
