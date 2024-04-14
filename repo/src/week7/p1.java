package week7;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        System.out.println(answer(x));

    }
    public static String answer(int i){
        return (i%2==0)? "Even":"Odd";
    }

}
