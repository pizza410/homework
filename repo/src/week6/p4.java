package week6;

public class p4 {
    String s1="Hare";
    static String s2="Krishna";
    int i1=5;
    static int i2=10;
    public static void main(String[] args) {
        p4 dc=new p4();
        dc.call2();
        call1();
    }
    public static void call1(){
        p4 dc=new p4();
        System.out.println(dc.s1+s2);
        System.out.println("sum of i1 and i2 is: "+(dc.i1+i2));
    }
    public void call2(){
        System.out.println(s1+s2);
        System.out.println("sum of i1 and i2 is: "+(i1+i2));

    }
}
