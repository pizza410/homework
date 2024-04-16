package week7.midweek;

import java.util.Scanner;

public class mp6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int i=input.nextInt();
        if(i<25)
            System.out.println("F");
        else if(i>=25 && i<45)
            System.out.println("E");
        else if(i>=45 && i<50)
            System.out.println("D");
        else if(i>=50 && i<60)
            System.out.println("C");
        else if(i>=60 && i<80)
            System.out.println("B");
        else if(i>=80)
            System.out.println("A");


    }
}
