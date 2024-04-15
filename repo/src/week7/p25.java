package week7;

import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name=input.nextLine();
        System.out.println("The name I have received is: "+printfunction(name));
    }

    private static String printfunction(String name) {
        return name;
    }
}
