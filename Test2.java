import java.util.*;
abstract class Shape
{
 abstract void numberOfSides();
 }
class Rectangle extends Shape
{
 void numberOfSides()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no of sides of Rectangle");
   int n=sc.nextInt();
   System.out.println("The no of sides is : "+n);
  }
}
class Triangle extends Shape
{
 void numberOfSides()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no of sides of Triangle");
   int n=sc.nextInt();
   System.out.println("The no of sides is : "+n);
  }
}
class Hexagon extends Shape
{
  void numberOfSides()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no of sides of Hexagon");
   int n=sc.nextInt();
   System.out.println("The no of sides is : "+n);
  }
}
class Test2
{
 public static void main(String args[])
 {
   Shape str1=new Rectangle();
  str1.numberOfSides();
   Shape str2=new Triangle();
   str2.numberOfSides();
   Shape str3=new Hexagon();
  str3.numberOfSides();
 }
}
 
