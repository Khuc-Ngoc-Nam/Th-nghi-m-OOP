package Lab01;
import java.util.Scanner;

public class Calculate2Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        String strNum1 = scanner.nextLine();

        System.out.print("Input the second number: ");
        String strNum2 = scanner.nextLine();

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        //calculate Sum
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Their sum is: " + sum);
        System.out.println("Their difference is: " + difference);
        System.out.println("Their product is: " + product);        
        
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient of them is: " + quotient);
        } else {
            System.out.println("Can't operate the division because divitor = 0.");
        }

    }
}
