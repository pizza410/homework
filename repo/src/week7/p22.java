package week7;

import java.util.Arrays;

import static week7.p21.suma;

public class p22 {
    public static void main(String[] args) {
        int[] numbers1={1,2,3,4,5};
        System.out.println("Array is "+ Arrays.toString(numbers1));
        average(numbers1);
    }

    private static void average(int[] numbers) {
      double average;
      average=(double) suma(numbers)/ numbers.length;
        System.out.println("The average is : "+average);
    }

}
