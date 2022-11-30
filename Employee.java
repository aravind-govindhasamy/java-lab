import java.util.*;
class Details
{
	String name;
	int emp_no;
	long phone_no;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee : ");
		name=sc.nextLine();
		System.out.println("Enter the employee no : ");
		emp_no=sc.nextInt();
		System.out.println("Enter the phone number : ");
		phone_no=sc.nextLong();
	}
	void display()
	{
		System.out.println("The name of the employee is : " + name);
		System.out.println("The employee no is : " + emp_no);
		System.out.println("The mobile phone number : " + phone_no);
		System.out.println();
	}  
}

class Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of employees : ");
		int n = sc.nextInt();
		Details obj[] = new Details[n];
		for(int i=0;i<n;i++)
		{
			obj[i] = new Details();
		}
		for(int i=0;i<n;i++)
		{
			obj[i].read();
		}
		System.out.println("Details of the Employees ");
		for(int i=0;i<n;i++)
		{
			obj[i].display();
		}
	}
}
