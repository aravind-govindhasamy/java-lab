import java.util.*;
class LargestMatele
{
	public static void main(String args[])
	{
		int arr[][] = new int[10][10];
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		r = sc.nextInt();
		System.out.println("Enter number of columns : ");
		c = sc.nextInt();
		System.out.println("Enter elements in matrix : ");
		for(int i = 0;i<r;i++)
		{	
			for(int j=0;j<c;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int big = 0;
		for(int i = 0;i<r;i++)
		{	
			for(int j=0;j<c;j++)
			{
				if(big<arr[i][j])					
					big=arr[i][j];
			}
		}
		System.out.println("LArgest number in matrix is " + big);
	}

}



