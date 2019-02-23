package com.bridgelabz.algorith;

import java.util.Scanner;

public class SqurtNonnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double c=sc.nextDouble();
		
		
			double epsilon=1e-15;
			double t=c;
			if(c>=0)
			{
			while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	            
	        }
			}
			System.out.println(t);
			
		}

	}


