package week6;

public class p17 {
    String city="Anand";
    static String country="India";
    public static void main(String[] args) {
        p17 dc=new p17();
        dc.call1();
        call2();
    }
    public void call1(){
        System.out.println("My country is: "+country);
    }
    public static void call2(){
        p17 dc=new p17();
        System.out.println("My city is: "+dc.city);
    }
}
