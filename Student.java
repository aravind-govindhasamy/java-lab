import java.util.*;
class Details
{
	String Name;
	int roll_no;
	int mark[];
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		Name = sc.nextLine();
		System.out.print("Enter Student roll no : ");
		roll_no = sc.nextInt();
		System.out.print("Enter the marks of five subject : ");
  		mark=new int[5];
  		for(int i=0;i<5;i++)
  		{
   			mark[i]=sc.nextInt();
   		}
	}
	void display()
	{
		System.out.println("Student Name    : " + Name);
		System.out.println("Student roll no : " + roll_no);
		System.out.print("Marks of five subjects are : ");
		for(int i=0;i<5;i++)
  		{
   			System.out.print(mark[i]);
			System.out.print("  ");
   		}
	}
}

class Student
{
	public static void main(String args[])
	{
		Details obj = new Details();
		obj.read();
		obj.display();
	}
}



























