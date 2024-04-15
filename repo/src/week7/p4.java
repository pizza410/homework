package week7;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.print("Enter boolean value: ");
        Scanner input=new Scanner(System.in);
        boolean b= input.nextBoolean();
        if(b){
            System.out.println("Code1");
        }
        else{
            System.out.println("Code2");
        }
    }

}
