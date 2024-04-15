package week7;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int x=input.nextInt();
            pon(x);
        }
        public static void pon(int x){
            if(x>0)
                System.out.println(x+" is positive number");
            else if(x==0)
                System.out.println("PLease enter anything apart from 0");
            else
                System.out.println(x+" is Negative number");
        }
    }
