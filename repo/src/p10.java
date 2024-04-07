import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int i=input.nextInt();
        multiplication(i);
    }
    public static void multiplication(int i){
        for(int j=1;j<11;j++){
            System.out.println(i+"x"+j+"="+(i*j));
        }
    }
}
