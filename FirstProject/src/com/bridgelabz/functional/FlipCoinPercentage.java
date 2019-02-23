package com.bridgelabz.functional;

import java.util.Scanner;

public class FlipCoinPercentage {
	public static void flipcoin(int n)
	
	{
		double result;
		double heads=0.0;
		double tailsp=0.0;
		for(int i=0;i<n;i++)
		{
			result=Math.random();
			if(result<=0.5) {
				
				System.out.println("it is heads ");
				heads++;
			}
			else {
				System.out.println("it is tail");
				tailsp++;
			}
		}
		
		double percenthead=heads/n*100;
		double percenttail=tailsp/n*100;
		System.out.println("percentage of heads "+percenthead);
		System.out.println("percentage of tails"+percenttail);
		}		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		/*for(int i=0;i<n;i++)
		{
			result=Math.random();
			if(result<=0.5) {
				
				System.out.println("it is heads ");
				heads++;
			}
			else {
				System.out.println("it is tail");
				tailsp++;
			}
		}
		
		double percenthead=heads/n*100;
		double percenttail=tailsp/n*100;
		System.out.println("percentage of heads "+percenthead);
		System.out.println("percentage of tails"+percenttail);
		}	*/	
		FlipCoinPercentage.flipcoin(n);
	}
}

