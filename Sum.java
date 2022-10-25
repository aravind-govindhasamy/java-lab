import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int a = sc.nextInt();
		for( int i=0;i<a+1;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of first " + a + " natural numbers are " + sum);
	}
}

