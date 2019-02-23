package myFirstapp;

import java.util.Scanner;

//import com.sun.tools.jdeprscan.scan.Scan;

public class PrimeFactor {
	public static  void pfactor(int number)
	{
		for(int i=2;i<=number;i++)
		{
			while(number%i==0)
			{
				//System.out.println(i+"");
				number=number%i;
			}	
			System.out.println(i+"");
		}
		if(number>2)
		{
			System.out.println(number);
		}

	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		System.out.println("given number is:"+number);
		System.out.println("prime factors are:");
		
		
		/*for(int i=2;i<=number;i++)
		{
			while(number%i==0)
			{
				//System.out.println(i+"");
				number=number%i;
			}	
			System.out.println(i+"");
		}
		if(number>2)
		{
			System.out.println(number);
		}

	}*/
		PrimeFactor.pfactor(number);

}}
