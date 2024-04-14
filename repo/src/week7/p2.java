package week7;

public class p2 {
    public static void main(String[] args) {
        String[] countries={"India","Shrilanka","United Kingdom","Canada","USA"};
        printarray(countries);
    }

    private static void printarray(String[] name) {
        for(int i=0;i<name.length;i++){
            System.out.println((i+1)+" "+name[i]);
        }
    }

}
