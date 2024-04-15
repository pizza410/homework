package week7.midweek;

import java.util.Scanner;

public class mp1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
    for(int i=1;i<=10;i++){
        System.out.print("Please enter "+i+" number: ");
        int k=input.nextInt();
        sum+=k;
    }
    double average=sum/10;
        System.out.println("Your average is "+average);
    }
}
