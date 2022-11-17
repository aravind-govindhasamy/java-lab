import java.util.*;
class StrPal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int flag=0;
		for(int i=0;i<(str.length())/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
			{
				flag = 1;
				break;
			}		
	
		}
		if(flag==0)
			System.out.println(str + " is pallindrome");
		else
			System.out.println(str + " is not pallindrome");
	}
}
