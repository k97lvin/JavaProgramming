package arrays;

import java.util.Scanner;

public class Min_Max_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a num;");


            //each number will be assigned to the index of the array
            numbers[i] = scan.nextInt();

        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }


        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}