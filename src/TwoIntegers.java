public class TwoIntegers 
{
	private int num1;
	private int num2;

	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String displayArithmetic()
	{
		int sum1 = num1 + num2;
		int sum2 = num1 - num2;
		int sum3 = num1 * num2;
		int sum4 = num1 / num2;
		return num1 + "+" + num2 + "=" + sum1 + "\n" + num1 + "-" + num2 + "=" + sum2
				+ "\n" + num1 + "*" + num2 + "=" + sum3 + "\n" + num1 + "/" + num2 + "=" + sum4;
	}
	public int Larger()
	{
		if(num1 < num2)
		{
			return num2;
		}
		else
		{
			return num1;
		}
	}
	public boolean isEven()
	{
		int sum = num1 + num2;
		if(sum % 2 == 0)
			return true;
		else
			return false;
	}
	public boolean isMultiple()
	{
		if(num2 % num1 ==0)
		{
			return true;	
		}
		else 
		{
			return false;	
		}
	}
}

