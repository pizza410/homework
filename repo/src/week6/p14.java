package week6;

import java.util.Scanner;

public class p14 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Please enter first number: ");
            double i1=input.nextDouble();
            System.out.print("Please enter second number: ");
            double i2=input.nextDouble();
            p14 dc=new p14();
            sum(i1,i2);
            subtraction(i1,i2);
            dc.multiplication(i1,i2);
            dc.division(i1,i2);
        }
        public static void sum(double i1,double i2){
            double result=i1+i2;
            System.out.println(i1+"+"+i2+"="+result);
        }
        public static void subtraction(double i1,double i2){
            double result=i1-i2;
            System.out.println(i1+"-"+i2+"="+result);
        }
        public void multiplication(double i1,double i2){
            double result=i1*i2;
            System.out.println(i1+"*"+i2+"="+result);
        }

        public void division(double i1,double i2){
            double result=i1/i2;
            System.out.println(i1+" / "+i2+"="+result);
        }

    }

