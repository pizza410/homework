package week7;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter first name:  ");
        double d1=input.nextDouble();
        System.out.print("Please enter second number: ");
        double d2=input.nextDouble();
        System.out.println("Please enter symbol as per options \nFor addition +"+
                "\nFor subtraction -\nFor multiplication * \nFor Division /");
        char c= input.next().charAt(0);
        calculator(d1,d2,c);
    }

    private static void calculator(double d1, double d2,char c) {
        if(c=='+')
            System.out.println("The sum is: "+(d1+d2));
        else if(c=='-')
            System.out.println("The subtraction is: "+(d1-d2));
        else if(c=='*')
            System.out.println("The multiplication is: "+(d1*d2));
        else
            System.out.println("The division is: "+(d1/d2));

    }

}
