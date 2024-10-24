package selenium_Basic_Program;
import java.util.Scanner;

public class Logic_Program_EVEN_OR_ODD 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter a Number = ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();//accepting value from user
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}