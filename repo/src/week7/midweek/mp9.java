package week7.midweek;

import java.util.Scanner;

public class mp9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("NUmbers of classes held: ");
        int nch=input.nextInt();
        System.out.print("Numbers of classes attended: ");
        int nca=input.nextInt();
        percentage(nch,nca);

    }
    public static void percentage(int a,int b){
        double per=(100*b)/a;
        System.out.println("The percentage of class attended is: "+per+"%");
        System.out.println("Did you have medical reason ? please enter Y or N:");
        Scanner input=new Scanner(System.in);
        String s=input.next().toUpperCase();
        if(per<75) {
            if (s.equals("Y")) {
                System.out.println("You are allowed to sit in exam.");
            }
            else {
                System.out.println("You are not allowed to sit in exam.");
            }
        }
        else
            System.out.println("You are allowed to sit in exam.");
    }
}
