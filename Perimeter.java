import java.util.*;
class Per
{
	Per(int r)
	{
		System.out.println("Perimeter of the circle is "+(2*3.14*r));
	}
	Per(int l,int b)
	{
		System.out.println("Perimeter of rectangle is "+(2*(l+b)));
	}
}

class Perimeter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		int c=sc.nextInt();
		System.out.println("Enter the length and width of rectangle : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Per obj1=new Per(c);
		Per obj2=new Per(a,b);
	}
}
