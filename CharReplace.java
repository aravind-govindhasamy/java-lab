import java.util.*;
class CharReplace
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Enter character to be replaced : ");
		char ch1 = sc.next().charAt(0);
		System.out.println("Enter new character : ");
		char ch2 = sc.next().charAt(0);
		int flag = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ch1)
			{
				str=str.replace(ch1,ch2);	
			}		
	
		}
		System.out.println(str);
	}
}
