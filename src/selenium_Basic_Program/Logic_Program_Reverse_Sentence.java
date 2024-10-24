package selenium_Basic_Program;

public class Logic_Program_Reverse_Sentence 
{
	public static void main(String[] args) 
	{
		String sent="I am an automation engineer";
		String splitArray[]=sent.split(" ");
		for(int i=0;i<splitArray.length;i++)
		{
			System.out.print(splitArray[i] + " ");
		}
		System.out.println("*****************");
		for(int i=splitArray.length-1;i>=0;i--)
		{
			System.out.print(splitArray[i] + " ");
		}
	}
}