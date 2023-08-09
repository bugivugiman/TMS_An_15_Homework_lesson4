import java.util.Scanner;
import java.util.Arrays;

public class Lesson4_2 {
    public static void main(String[] args) {
        System.out.print("Enter size of new array: ");
        Scanner Sc = new Scanner(System.in);
        int SizeArray = Sc.nextInt();

        int[] MyArray = new int[SizeArray];
        for(int i = 0; i < MyArray.length; i++){
            MyArray[i] = (int)(Math.random() * 10) + 1;
        }
        int MinNumber = 100;
        int MaxNumber = 0;
        int MidNumber;
        int MidSum = 0;
        for(int i = 0; i < MyArray.length; i++){
            if(MyArray[i] < MinNumber){
                MinNumber = MyArray[i];
            }
            if(MyArray[i] > MaxNumber){
                MaxNumber = MyArray[i];
            }
            MidSum = MidSum + MyArray[i];
        }
        MidNumber = MidSum / MyArray.length;

        System.out.println("max: " + MaxNumber);
        System.out.println("min: " + MinNumber);
        System.out.println("middle: " + MidNumber);
        //System.out.println(Arrays.toString(MyArray));
    }
}
