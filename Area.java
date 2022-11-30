import java.util.*;
class Shape
{
	void area(int l,int b)
	{
		System.out.println("Area of the rectangle is "+ (l*b));
	}
	void area(int r)
	{
		System.out.println("Area of the circle is " + (3.14*r*r));
	}
}

class Area
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length and breadth of the rectangle : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Enter the radius : ");
		int c=sc.nextInt();
		Shape obj=new Shape();
		obj.area(a,b);
 		obj.area(c);
	}
}
