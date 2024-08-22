package javalabs3;

import java.util.Scanner;

class Mover
{
	void area(double r)
	{
		System.out.println("area of circle="+3.14*r*r);
	}
	void area(int a,int b)
	{
		System.out.println("area of rectangle="+a*b);
	}
	void area( double l,double h)
	{
	System.out.println("area of traingle="+1/2*l*h);	
}
}

public class Methodoverloading
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
        Mover obj= new Mover();
		System.out.println("enter the radius of the circle");
		double x=sc.nextDouble();
		System.out.println("enter the length and breadth of the rectangle ");
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println("enter the height and base of the traingle");
		double m=sc.nextDouble();
		double n=sc.nextDouble();
		obj.area(x);
		obj.area(y,z);
		obj.area(m,n);
		
	}
}

		
				
				
		
		
	



