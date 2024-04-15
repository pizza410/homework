package week7;

import java.util.Arrays;

public class p21 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        System.out.println("THe sum of array elements are: "+suma(numbers));
    }

    public static int suma(int[] numbers) {
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }
}
