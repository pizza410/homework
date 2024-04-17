package week6;

public class p18 {
    static String council="Stanmore";
    int hno=476;
    public static void main(String[] args) {
        p18 dc=new p18();
        dc.borough();
        address();
    }
    public void borough(){
        System.out.println(council);
    }
    public static void address(){
        p18 dc=new p18();
        System.out.println(dc.hno);
    }
}
