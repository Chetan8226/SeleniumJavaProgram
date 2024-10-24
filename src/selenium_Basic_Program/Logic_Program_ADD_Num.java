package selenium_Basic_Program;

public class Logic_Program_ADD_Num 
{
	public static void main(String[] args) 
	{
		int num=56789;
		int sum=0;
		while(num>0)
		{
			int temp=num%10;
			num=num/10;
			sum=sum+temp;
		}
		System.out.println("ADD of Number = " + sum);
	}
}