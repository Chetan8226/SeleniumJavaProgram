package selenium_Basic_Program;

public class Logic_Program_Factorial 
{

	public static void main(String[] args) 
	{
		int num=5,fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial = " + fact);

	}

}
