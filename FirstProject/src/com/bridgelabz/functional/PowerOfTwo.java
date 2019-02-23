package com.bridgelabz.functional;

import java.util.Scanner;

public class PowerOfTwo {
	public static void powerof2(int n)
	{
		if((n>=0)&&(n<=31))
		{
			System.out.println("power of 2"+"  "+n+"is"+"  "+(Math.pow(2, n)));
		}
			else
				System.out.println("not valid number");
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		/*if((n>=0)&&(n<=31))
		{
			System.out.println("power of 2"+"  "+n+"is"+"  "+(Math.pow(2, n)));
		}
			else
				System.out.println("not valid number");
	
		for(int i=1;i<=0;i++)
		{
			System.out.println("power of 2"+"  "+n+"is"+"  "+(Math.pow(2, n)));
		}*/
		PowerOfTwo.powerof2(n);
			
		}

	}


