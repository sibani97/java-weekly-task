package com.bridgelabz.functional;

import java.util.Scanner;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;

public class QuadraticEquation15 {
	public static void quadraticeq(int a,int b,int c)
	{
		double root1,root2;
		double d=b*b-4*a*c;
		if(d>0)
		{
			System.out.println("roots are real and unequal");
			root1=(-b+Math.sqrt(a))/(2*a);
			root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("first root:"+root1);
			System.out.println("second root:"+root2);
			
		}
		else if(d==0)
		{
			System.out.println("roots are real and equal");
			root1=(-b+Math.sqrt(a))/(2*a);
			System.out.println("first root:"+root1);
		}
		else
		{
			System.out.println("roots are imaginary");
		}
		
		
	}

	private static int Sqrt(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
		int a=sc.nextInt();
		System.out.println("enter the 2nd no");
		int b=sc.nextInt();
		
		System.out.println("enter the 3rd no");
		int c=sc.nextInt();
		QuadraticEquation15.quadraticeq(a,b,c);
		

	}

}
