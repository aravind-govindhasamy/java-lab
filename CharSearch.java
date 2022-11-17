import java.util.*;
class CharSearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Enter character to be searched : ");
		char ch = sc.next().charAt(0);
		int flag = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ch)
			{
				System.out.println("Character is at " + (i+1) + "th position" );
				flag=1;
				break;
			}		
	
		}
		if(flag!=1)
			System.out.println("Character not found");
			
	
	}
}
