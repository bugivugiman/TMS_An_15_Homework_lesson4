import java.util.Scanner;

public class Lesson4_0 {
    public static void main(String[] args) {
        int[] CheckArray = { 2, 6, 9, 113, 231};
        System.out.print("Enter number: ");
        Scanner CheckScan = new Scanner(System.in);
        int CheckNumber = CheckScan.nextInt();
        int k = 0;
        for (int i = 0; i < CheckArray.length; i++) {
            if (CheckArray[i] == CheckNumber) {
                k++;
                System.out.println("Number " + CheckArray[i] + " is in array");

            }
        }
        if(k == 0){
            System.out.println("sorry");
        }


    }
}
