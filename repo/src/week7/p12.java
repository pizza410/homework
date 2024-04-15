package week7;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the alphabet between A to F : ");
        String s = input.nextLine();
        printcity1(s.toUpperCase());
    }

    private static void printcity1(String x) {
        switch(x){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bhopal");
                break;
            case "C":
                System.out.println("Chandigarh");
                break;
            case "D":
                System.out.println("Dehradun");
                break;
            case "E":
                System.out.println("Elora");
                break;
            case "F":
                System.out.println("Fuji");
                break;
            default:
                System.out.println("Please enter the valid character");
                break;
            }
        }
    }
