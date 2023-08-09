import java.util.Arrays;
import java.util.Scanner;

public class Lesson4_1 {
    public static void main(String[] args) {
        int[] FirstArray = {3, 6, 8, 11, 54, 8};
        int[] SecondArray = new int[6];

        System.out.print("Enter number: ");
        Scanner SNumber = new Scanner(System.in);
        int SearchingNumber = SNumber.nextInt();
        int k = 0;
        for (int i = 0; i < FirstArray.length; i++){
            if(SearchingNumber != FirstArray[i]){
                SecondArray[i] = FirstArray[i];
            }
            else{
                k++;
                continue;
            }
        }
        if (k == 0){
            System.out.println("we don't have this number");
        }
        //System.out.println(Arrays.toString(SecondArray));


    }
}
