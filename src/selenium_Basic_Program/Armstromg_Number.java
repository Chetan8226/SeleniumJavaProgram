package selenium_Basic_Program;

public class Armstromg_Number 
{

	public static void main(String[] args) 
	{
		int num=371,rem,sum=0;
		int num1=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(num1==sum)
		{
			System.out.println("Given number is Armstrong Number");
		}
		else
		{
			System.out.println("Given number is Not Armstrong Number");
		}
	

	}

}
