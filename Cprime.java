import java.util.Scanner;
class Cprime
{
	public static void main(String args[])
	{
		int c =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to be checked as prime or not " );
		int a = input.nextInt();
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{	c++;
				break; 
			}
		}
		if (c==0)
			System.out.println(a + " is a prime number");
		else
			System.out.println(a + " is not a prime number");
	}
}
