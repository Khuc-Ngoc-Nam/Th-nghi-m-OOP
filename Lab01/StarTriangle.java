package Lab01;
import java.util.Scanner;

public class StarTriangle {
	 public static void main(String[] args) {
		 Scanner height = new Scanner(System.in);
		 
		 int n = height.nextInt();
		 
		 for (int i = 1; i <= n; i++) {
			 for (int j = i; j < n; j++) {
				 System.out.print(" ");
			 }
			 for (int k = 1; k <= 2 * i - 1; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }

}
