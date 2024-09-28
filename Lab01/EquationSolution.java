package Lab01;
import java.util.Scanner;

public class EquationSolution {

    // ax + b = 0
    public static String solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b != 0) {
                return "The equation has no solution";
            } else {
                return "The equation has infinitely many solutions";
            }
        }
        return "The equation has solution: " + (-b / a);
    }

    // ax^2 + bx + c = 0
    public static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            
            return solveLinearEquation(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                return "The equation has no solution";
            } else if (delta == 0) {
                return "The equation has a double root: " + (-b / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "The equation has two distinct solutions: x1 = " + x1 + ", x2 = " + x2;
            }
        }
    }

    // hpt
    public static String solveLinearSystem(double a11, double a12, double a21, double a22, double b1, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            return "The system of equation has only solution: x1 = " + x1 + ", x2 = " + x2;
        } else {
            if (D1 == 0 && D2 == 0) {
                return "The system of equations has infinitely many solutions";
            } else {
                return "The system of equations has no solution";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ax + b = 0
        System.out.print("Input the coefficient a for the linear equation: ");
        double a = scanner.nextDouble();
        System.out.print("Input the coefficient b for the linear equation: ");
        double b = scanner.nextDouble();
        System.out.println(solveLinearEquation(a, b));

        // ax^2 + bx + c = 0
        System.out.print("Input the coefficient A for the quadratic equation: ");
        double A = scanner.nextDouble();
        System.out.print("Input the coefficient B for the quadratic equation: ");
        double B = scanner.nextDouble();
        System.out.print("Input the coefficient C for the quadratic equation: ");
        double C = scanner.nextDouble();
        System.out.println(solveQuadraticEquation(A, B, C));

        // hpt
        System.out.print("Input a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Input a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Input a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Input a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Input b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Input b2: ");
        double b2 = scanner.nextDouble();
        System.out.println(solveLinearSystem(a11, a12, a21, a22, b1, b2));
    }
}
