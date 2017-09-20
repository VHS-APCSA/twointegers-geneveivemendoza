import java.util.Scanner;

public class TwoIntegers 
{
	private int num1;
	private int num2;
	public TwoIntegers()
	{
		this.num1 = 0;
		this.num2 = 0;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	if (num1 > num2)
		System.out.printf("%d > %d\n", num1, num2);
	}
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public int sum()
	{
		int sum = (num1 + num2);
		return sum;
	}
	public int product()
	{
		int product = (num1 * num2);
		return product;
	}
	public int difference()
	{
		int difference = (num1 - num2);
		return difference;		
	}
	public int quotient()
	{
		int quotient = (num1 / num2);
		return quotient;
	}
	public String arithmetic()
	{
		String arithmetic = "";
		arithmetic = "Sum = " + sum();
		arithmetic = "Product =" + product();
		arithmetic = "Difference =" + difference();
		arithmetic = "Quotient =" + quotient();
		return arithmetic;
	}
	public int nextInt() 
	{
		return 0;
	}
}
