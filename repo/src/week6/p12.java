package week6;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        average();
    }
    public static void average(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter 3 digits: ");
        double d1=input.nextDouble();
        double d2=input.nextDouble();
        double d3=input.nextDouble();
        double avg=(d1+d2+d3)/3;
        System.out.println(avg);
        }
    }
