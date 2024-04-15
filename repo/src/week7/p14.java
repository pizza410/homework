package week7;

import java.util.ArrayList;

public class p14 {
    public static void main(String[] args) {
        function();
    }

    private static void function() {
        ArrayList<Integer> for3=new ArrayList<>();
        ArrayList<Integer> for5=new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(i%3==0)
                for3.add(i);
            if(i%5==0)
                for5.add(i);
        }
        System.out.println(for3.toString());
        System.out.println(for5.toString());
    }
}
