import java.util.Arrays;

public class Lesson4_3 {
    public static void main(String[] args) {
        int[] Array1 = {3, 5, 7, 9, 141};
        int[] Array2 = {1, 7, 3, 12, 129};
        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));
        int sumArray1 = 0;
        int midArray1 = 0;
        int sumArray2 = 0;
        int midArray2 = 0;
        for (int i = 0; i < Array1.length; i++){
            sumArray1 = sumArray1 + Array1[i];
        }
        midArray1 = sumArray1 / Array1.length;
        for (int j = 0; j < Array2.length; j++){
            sumArray2 = sumArray2 + Array2[j];
        }
        midArray2 = sumArray2 / Array2.length;

        if(midArray1 > midArray2){
            System.out.println("middle value array #1 > middle value array #2");
        } else if (midArray2 > midArray1) {
            System.out.println("middle value array #1 < middle value array #2");
        }
        else{
            System.out.println("middle value array #1 equals middle value array #2");
        }

    }
}
