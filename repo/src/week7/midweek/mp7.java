package week7.midweek;

import java.util.Scanner;

public class mp7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the age of 3 people: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b && a>c)
            System.out.println("Oldest is:  "+a);
        else if(b>a && b>c)
            System.out.println("Oldest is "+b);
        else
            System.out.println("Oldest is "+c);

        if(a<b && a<c)
            System.out.println("Youngest is:  "+a);
        else if(b<a && b<c)
            System.out.println("Youngest is "+b);
        else
            System.out.println("Youngest is "+c);

    }
}
