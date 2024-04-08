public class p20 {
    String s="Spain";
    static String v="United Kingdom";

    public static void main(String[] args) {
        p20 dc=new p20();
        dc.homecountry();
        holidays();

    }
    public void homecountry(){
        System.out.println("My home county is: "+v);
    }
    public static void holidays(){
        p20 dc=new p20();
        System.out.println("My holiday destinatio is: "+dc.s);
    }
}
