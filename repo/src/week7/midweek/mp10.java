package week7.midweek;

import java.util.Scanner;

public class mp10 {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int i1=input.nextInt();
        System.out.print("Please enter second number: ");
        int i2=input.nextInt();
        System.out.println("Total is equals to: "+(i1+i2));
    }
}
