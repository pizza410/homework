package week6;

public class p3 {
    String s="kem cho Bhaveshbhai";
    static int i=410;
    public static void main(String[] args) {
        call();
        p3 dc=new p3();
        dc.call2();
    }
    public static void call(){
        p3 dc=new p3();
        System.out.println(dc.s+" "+i);
    }
    public void call2(){
        System.out.println(s+" "+i);
    }
}
