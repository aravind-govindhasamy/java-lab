import java.util.Scanner;
class Asmall
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
	int small=arr[0];
	for(int i=0;i<n;i++)
	{
		if(arr[i]<small)
			small = arr[i];
	}
	System.out.println("Smallest element is " + small);
		
	}
}
