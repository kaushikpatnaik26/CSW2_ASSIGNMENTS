package ErrorHandling;
import java.util.Scanner;

public class Q08 {
	
	public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(num);
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        try {
            double squareRoot = calculateSquareRoot(number);
            System.out.println("Square root of " + num + " is: " + squareRoot);
        } catch (ArithmeticException e) {
            System.out.println("Square root of negative number is a complex number.");
        }finally {
        	sc.close();
        }
    }

    
}
