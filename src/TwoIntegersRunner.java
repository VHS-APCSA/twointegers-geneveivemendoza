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
    	TwoIntegers twoIntegers = new TwoIntegers(num1, num2);
    	boolean even = twoIntegers.isEven();
    	System.out.println(twoIntegers.getNum1() + " and " + num2 + " are even = " + even);
    	boolean multiple = twoIntegers.isMultiple();
    	System.out.println(twoIntegers.getNum1() + " is multiple of " + num2 + " = " + multiple);
    	String operators = twoIntegers.arithmetic();
    	System.out.println("Sum = " + twoIntegers.sum());
    	System.out.println("Product = " + twoIntegers.product());
    	System.out.println("Difference = " + twoIntegers.difference());
    	System.out.println("Quotient = " + twoIntegers.quotient());
    	System.out.println(operators);
    	String compare = twoIntegers.comparingIntegers();
    	System.out.printf("%d > %d\n", num1, num2);
    	System.out.println(num1 + " is larger " + num2 + " :" + (num1 > num2));
    	System.out.printf("%d = %d\n", num1, num2);
    	System.out.println("The numbers are equal " + ":" + (num1 == num2));	
    	System.out.println(compare);
    }
}
