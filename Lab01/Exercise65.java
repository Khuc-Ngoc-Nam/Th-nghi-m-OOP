package Lab01;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise65 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

       
        System.out.print("The number of elements in the array is: ");
        int n = inp.nextInt();
        int[] numericArray = new int[n];

        System.out.println("Input each element of the array");
        for (int i = 0; i < n; i++) {
            numericArray[i] = inp.nextInt();
        }


        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < numericArray.length; i++) {
                if (numericArray[i] < numericArray[i - 1]) {
                    int reserve = numericArray[i];
                    numericArray[i] = numericArray[i - 1];
                    numericArray[i - 1] = reserve;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("The array after sorted: " + Arrays.toString(numericArray));

        int sum = 0;
        for (int num : numericArray) {
            sum += num;
        }

        double average = (double) sum / numericArray.length;


        System.out.println("The sum of elements: " + sum);
        System.out.println("The average: " + average);
    }
}


