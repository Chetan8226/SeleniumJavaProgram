package selenium_Basic_Program;

public class Logic_Program_ReverseNumberOrString 
{
	public static void main(String[] args) 
	{
		int num=12345;
		String str="ChetanNannaware";// For Name reverse
		String strNum=Integer.toString(num);
		String strRev="";
		char ch;
		for(int i=strNum.length()-1;i>=0;i--)
		{
			ch=strNum.charAt(i);
			strRev=strRev+ch;
		}
		System.out.println("String Reverse Number = " + strRev);
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			strRev=strRev+ch;
		}
		System.out.println("String Reverse Name = " + strRev);
	}
}