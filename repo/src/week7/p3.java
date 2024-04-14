package week7;

public class p3 {
    public static void main(String[] args) {
        String[][] country={
                {"India","Delhi"},
            {"Pskistan","Islamabad"},
            {"UK","London"},
            {"Canada","Otawa"},
            {"USA","WashingtonDc"}
        };
        printArray(country);
    }
    public static void printArray(String[][] name){
        for(int i=0;i<name.length;i++){
            for(int j=0;j<name[i].length;j++){
                System.out.print(name[i][j]+" ");
            }
            System.out.println();
        }
    }
}
