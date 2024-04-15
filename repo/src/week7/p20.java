package week7;

import java.util.Arrays;

public class p20 {
    public static void main(String[] args) {
        int[] numeric={1,5,9,2,6,1};
        System.out.println("Original = "+Arrays.toString(numeric));
        String[] names={"Shubham","Jay","Alkesh","Vidhi"};
        System.out.println("Original = "+Arrays.toString(names));
        Arrays.sort(numeric);
        Arrays.sort(names);
        System.out.println("Sorted numeric "+Arrays.toString(numeric));
        System.out.println("Sorted string array: "+Arrays.toString(names));
    }
}
