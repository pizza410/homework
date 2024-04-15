package week7;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter sales ID: ");
        int sale_id=input.nextInt();
        System.out.print("Enter seller's name: ");
        Scanner input1=new Scanner(System.in);
        String sellerName=input1.nextLine();
        System.out.print("Enter sales amount: ");
        Scanner input2=new Scanner(System.in);
        double salesAmount=input2.nextDouble();
        System.out.print("Enter salary basic: ");
        Scanner input3=new Scanner(System.in);
        double salaryBasic=input3.nextDouble();
        finedsales(salesAmount);
    }

    private static void finedsales(double d) {
        if(d>=50000){
            System.out.println("Your fined is 35% which equals to: "+(d*0.35));
        }
        else if(d>=30000){
            System.out.println("You are fined by 20% which is equals to: "+(d*0.20));
        }
        else if(d>=20000){
            System.out.println("You are fined by 10% equals to: "+(d*0.10));
        }
        else if(d>=10000){
            System.out.println("You are fined by 10%: "+(d*0.05));
        }
        else{
            System.out.println("You are fined by 2% : "+(d*0.02));
        }
    }

}
