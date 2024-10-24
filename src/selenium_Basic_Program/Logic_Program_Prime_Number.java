package selenium_Basic_Program;

public class Logic_Program_Prime_Number 
{
	public static void main(String[] args) 
	{
		int num=7,count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}
}