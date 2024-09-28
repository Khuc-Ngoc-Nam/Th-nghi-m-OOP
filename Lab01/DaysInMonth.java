package Lab01;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m;
        int y;
    
        while (true) {
            System.out.print("Input month ");
            m = input.nextInt();
            if (m >= 1 && m <= 12) {
                break; 
            } else {
                System.out.println("The month is invalid, please input a correct month: ");
            }
        }

        System.out.print("Input year ");
        y = input.nextInt();

        int days = 0;

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            days = 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            days = 30;
        } else if (m == 2) {
          
            if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
                days = 29; 
            } else {
                days = 28;
            }
        }

  
        System.out.println("The number of days at month " + m + " in year " + y + " is " + days);
    }
}
