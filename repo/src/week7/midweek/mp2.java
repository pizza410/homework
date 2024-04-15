package week7.midweek;

public class mp2 {
    public static void main(String[] args) {
        int[] numbers={24,50,29};
        for(int i=0;i<numbers.length;i++){
            for(int j=1;j<=10;j++){
                System.out.println(numbers[i]+"x"+j+"="+(numbers[i]*j));
            }
            System.out.println();
        }

    }
}

