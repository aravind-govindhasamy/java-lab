import java.util.Scanner;
class Asum
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter size of array ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter element ");
		arr[i] = sc.nextInt();
	}
	int sum = 0;
	for(int i=0;i<n;i++)
	{
		sum=sum + arr[i];
	}
	System.out.println("Sum of elements in array is " + sum);
		
	}
}
