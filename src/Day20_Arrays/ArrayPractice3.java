package Day20_Arrays;

import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("How many numbers would you like to add: ");
        int length =scan.nextInt();

        if (length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers  = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter number:");
        }

    }
}
