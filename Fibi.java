import java.util.Scanner;
class Fibi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit ");
		int a = sc.nextInt();
		int f=0,s=1;
		System.out.println("Fibinocii series is ");
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=a;i++)
		{
			
			int t = f + s;
			System.out.println(t);
			f=s;
			s=t;
		}
	}
}
