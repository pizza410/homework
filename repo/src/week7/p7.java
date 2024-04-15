package week7;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int x=input.nextInt();
        answer(x);
    }
    public static void answer(int x){
        if(x%2==0)
            System.out.println(x+" is even number");
        else
            System.out.println(x+" is odd number");
    }
}
