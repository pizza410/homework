package week7;

public class p9 {
    public static void main(String[] args) {
        String s="code1";
        printName(s);
    }

    private static void printName(String s) {
        for(int i=1;i<=10;i++){
            System.out.println(i+" "+s);
        }
    }
}
