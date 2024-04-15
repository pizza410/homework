package week7.midweek;

import java.util.Scanner;

public class mp4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length: ");
        double length=input.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth=input.nextDouble();
        boolean b=(length==breadth)? true:false;
        if(b)
            System.out.println("It is square");
        else
            System.out.println("It is not square");
    }
}
