import java.util.*;
class employee
{
	String name;
	String address;
	int age;
	double phone;
	int salary;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee:");
		name=sc.nextLine(); 
		System.out.println("Enter the address of the employee");
		address=sc.nextLine(); 
		System.out.println("Enter the age ");
		age=sc.nextInt();
		System.out.println("Enter the phone number:");
		phone=sc.nextDouble();
		
	}
	
	void print_salary()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the salary");
	int salary=sc.nextInt();
	System.out.println("The salary of the employee is: "+salary);
	}
}
	class Officer extends employee
{
	void spcl()
	{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the specialization : ");
 String specialization=sc.nextLine();
 System.out.println("The specialization is "+specialization);
 }
 void print()
 {
  spcl();
 super.read();
 super.print_salary();
 }
}

class Manager extends employee
{
 void dept()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the department ");
   String dept=sc.nextLine();
   }
  void display()
  {
  dept();
  super.read();
  super.print_salary();
  }
  }


class Test1
 {
 public static void main(String args[])
 {
   Officer obj1=new Officer();
   obj1.print();
   Manager obj2=new Manager();
   obj2.display();
  }
 }


















	
