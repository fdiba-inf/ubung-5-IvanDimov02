package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];
        int x;

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        for (int index = 0; index < numbers.length; index++) {
          for(int j = 0; j < numbers.length - 1; j++) {
          if(numbers[j] < numbers[j+1]) {
            x = numbers[j];
            numbers[j] = numbers [j+1];
            numbers [j+1] = x;
            
          }
        }
      }

        

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
