import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;

		
		System.out.println("Sum of " + a + " and " + b +" and " + c + " is " + sum);
	}
}

