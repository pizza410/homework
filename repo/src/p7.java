import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value degree Fahrenheit: ");
        double i=input.nextDouble();
        converter(i);
    }
    public static void converter(double i){
        System.out.println("Temperature in degree Celsius is: "+((i-32)*5/9));
    }
}
