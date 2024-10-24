package selenium_Basic_Program;

public class Pattern_Program_3_Pyramid 
{
	public static void main(String[] args) 
	{
		int star=1, space=4;
		for(int row=1;row<=5;row++)  //rows
		{
			for(int i=1;i<=star;i++)  //star
			{
				System.out.print("*");
			}
			for(int j=1;j<=space;j++)  //space
			{
				System.out.print(" ");
			}
			System.out.println();
			star++;
			space--;
		}
	}
}