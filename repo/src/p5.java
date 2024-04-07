public class p5 {
    static double i1=12;
    static double i2=13;
    public static void main(String[] args) {
        p5 dc=new p5();
        sum(i1,i2);
        subtraction(i1,i2);
        dc.multiplication(i1,i2);
        dc.division(i1,i2);
    }
    public static void sum(double i1,double i2){
        double result=i1+i2;
        System.out.println(result);
    }
    public static void subtraction(double i1,double i2){
        double result=i1-i2;
        System.out.println(result);
    }
    public void multiplication(double i1,double i2){
        double result=i1*i2;
        System.out.println(result);
    }

    public void division(double d1,double d2){
        double result=i1/i2;
        System.out.println(result);
    }
}
