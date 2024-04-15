package week7;

public class p26 {
    public static void main(String[] args) {
            String name = "Shubham Panchal";
            String blank="";
            for(int j=name.length();j>0;j--){
                blank+= name.charAt(j-1);
            }
            System.out.println(blank);

        }

    }
