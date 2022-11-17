import java.util.*;
class MatrixSum
{
	public static void main(String args[])
	{
		int arr1[][] = new int[10][10];
		int arr2[][] = new int[10][10];
		int sum[][] = new int[10][10];
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		r = sc.nextInt();
		System.out.println("Enter number of columns : ");
		c = sc.nextInt();
		System.out.println("Enter elements in first matrix : ");
		for(int i = 0;i<r;i++)
		{	
			for(int j=0;j<c;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter elements in second matrix : ");
		for(int i = 0;i<r;i++)
		{	
			for(int j=0;j<c;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}



		for(int i = 0;i<r;i++)
		{	
			for(int j=0;j<c;j++)
			{
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("Added matrix is : ");
		for(int i = 0;i<r;i++)
		{	
			for(int j=0;j<c;j++)
			{
				System.out.print(" " + sum[i][j]);
			}
			System.out.println();
		}

	}

}



