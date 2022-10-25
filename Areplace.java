import java.util.Scanner;
class Areplace
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
	System.out.println("Enter element to be replaced ");
	int a = sc.nextInt();
	System.out.println("Enter new element ");
	int b = sc.nextInt();

	for(int i=0;i<n;i++)
	{
		if(arr[i] == a)
			arr[i]=b;
	}
	System.out.println("Updated array is ");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
		
	}
	
	}
}
