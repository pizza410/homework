package week6;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        System.out.print("Please enter a radius: ");
        Scanner input = new Scanner(System.in);
        float i=input.nextFloat();
        area(i);
    }
    public static void area(Float i){
        System.out.println("Area is "+(3.14*i*1));
    }

}
