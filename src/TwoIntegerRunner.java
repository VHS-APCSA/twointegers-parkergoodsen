import java.util.Scanner;
public class TwoIntegerRunner 
{
	public static void main (String[] args)
	{
		Scanner imput = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int value1 = imput.nextInt();
		System.out.print("Enter seccond integer: ");
		int value2 = imput.nextInt();
		TwoIntegers twointegers = new TwoIntegers (value1, value2);
		int num1 = twointegers.getNum1();
		int num2 = twointegers.getNum2();
		String arithmetic = twointegers.displayArithmetic();
		System.out.println(arithmetic);
		int larger = twointegers.Larger();
		System.out.println(larger + " Is larger than the other number");
		boolean isEven = twointegers.isEven();
		System.out.println("Is the sum of the two integers even? " + isEven);
		boolean isMultiple = twointegers.isMultiple();
		System.out.println("Is " + num1 + " a multiple of " + num2 + "? " + isMultiple);
		
	}
}