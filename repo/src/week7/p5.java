package week7;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name=input.nextLine();
        System.out.print("Please enter rollNo: ");
        int rollNo=input.nextInt();
        System.out.print("Please enter Math marks: ");
        double mathMarks=input.nextDouble();
        System.out.print("Please enter Science Marks: ");
        double scienceMarks= input.nextDouble();
        System.out.print("Please enter English marks: ");
        double englishMarks=input.nextDouble();
        double total=mathMarks+scienceMarks+englishMarks;
        System.out.println("|---------------------------------------------------------|");
        System.out.println("|                 Mark Sheet                              |");
        System.out.println("|_________________________________________________________|");
        System.out.println("|        Name        :"+name+ "             |");
        System.out.println("|        Roll No     :"+rollNo+"                          |");
        System.out.println("|_________________________________________________________|");
        System.out.println("|        Subjects     :Marks                              |");
        System.out.println("|        Math         :"+mathMarks+"                      |");
        System.out.println("|        Science      :"+scienceMarks+"                    |");
        System.out.println("|        English      :"+englishMarks+ "             |");
        System.out.println("|_________________________________________________________|");
        System.out.println("|        Total         :"+total+            "             |");
        System.out.println("|_________________________________________________________|");
        System.out.println("|        Percentage   :"+percentage(total)+ "             |");
        System.out.println("|        Result       :"+status(total)+     "             |");
        System.out.println("|        Grade        :"+grades(total)+     "             |");
        System.out.println("|_________________________________________________________|");

    }

    public static double percentage(double total) {
        double percenn=(100*total)/300;
        return percenn;
    }
    public static String status(double total){
       return (percentage(total)>=35)? "Pass":"Fail";

    }
    public static String grades(double total){
        double d=percentage(total);
      if(d>=80)
          return "A+";
      else if(d>=60)
          return "A";
      else if(d>=50)
          return "B";
      else if(d>=35)
          return "C";
      else
          return "F";
    }
}
