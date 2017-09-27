import java.util.Scanner;

public class TwoIntegersRunner 
{
	public static void main(String[] args)
	 {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter first integer.");
    	int num1 = input.nextInt();
    	System.out.println("Enter second integer.");
    	int num2 = input.nextInt();
    	TwoIntegers twointegers = new TwoIntegers(2, 4);
    	System.out.println(num1 + " is multiple of " + num2);
    }
}
