package myFirstapp;

import java.util.Scanner;

public class HarmonicNumber {
	public static void hermonic(int n)
	{
		if(n!=0)
		{
			double sum=0.0;
			for(int i=1;i<n;i++)
			{
				sum+=1.0/i;
			}
			System.out.println(sum);
		}	
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		/*if(n!=0)
		{
			double sum=0.0;
			for(int i=1;i<n;i++)
			{
				sum+=1.0/i;
			}
			System.out.println(sum);
		}	
		}*/
		HarmonicNumber.hermonic(n);
	}

}


