package week7;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            System.out.print("Please enter the alphabet between A to F : ");
            String s = input.nextLine();;
            printcity(s.toUpperCase());
    }

    private static void printcity(String v) {
            if (v.equals("A"))
                System.out.println("Ahmedabad");
            else if (v.equals("B"))
                System.out.println("Bhopal");
            else if (v.equals("C"))
                System.out.println("Chandigargh");
            else if (v.equals("D"))
                System.out.println("Delhi");
            else if (v.equals("E"))
                System.out.println("Ellora");
            else if (v.equals("F"))
                System.out.println("Fagu");
            else
                System.out.println("Invalid entry please enter between A to F");

        }
    }
