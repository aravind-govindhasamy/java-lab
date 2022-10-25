import java.util.Scanner;
class Factors
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find the factors " );
		int a = input.nextInt();
		System.out.println("factors are " );
		for(int i=1;i<a+1;i++)
		{
			if(a%i==0)
			{	System.out.println(i); 
			}
		}
	}	
}
