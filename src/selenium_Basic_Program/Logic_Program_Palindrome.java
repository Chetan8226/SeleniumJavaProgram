package selenium_Basic_Program;

public class Logic_Program_Palindrome 
{

	public static void main(String[] args) 
	{
		String str="madam";
		String strOriginal=str;
		String strrev="";
		char ch;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			strrev=strrev+ch;
			
		}
		System.out.println("Original String = " + strOriginal);
		System.out.println("Reverse String = " + strrev);
		if(strOriginal.equals(strrev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	

	}

}
