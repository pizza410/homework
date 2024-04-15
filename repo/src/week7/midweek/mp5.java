package week7.midweek;

import java.util.Scanner;

public class mp5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double d1=input.nextDouble();
        System.out.print("Please enter second number: ");
        double d2=input.nextDouble();
        greatest(d1,d2);
    }

    private static void greatest(double d1, double d2) {
        if(d1>d2)
            System.out.println(d1+" is bigger");
        else if(d1==d2)
            System.out.println("Both are same");
        else
            System.out.println(d2+" is bigger");
    }
}
