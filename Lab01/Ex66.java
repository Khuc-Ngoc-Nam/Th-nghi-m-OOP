package Lab01;
import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("rows: ");
        int rows = inp.nextInt();
        System.out.print("cols: ");
        int cols = inp.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at address [" + i + "][" + j + "]: ");
                matrix1[i][j] = inp.nextInt();
            }
        }

        System.out.println("Elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at address [" + i + "][" + j + "]: ");
                matrix2[i][j] = inp.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of 2 matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

