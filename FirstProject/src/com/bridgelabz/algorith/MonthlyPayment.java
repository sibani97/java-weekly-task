package com.bridgelabz.algorith;

import java.util.Scanner;

public class MonthlyPayment {
	public static void payment(int year,double principal,double rate)
	{
		double n;double r;
		n=12*year;
		r=rate/(12*100);
		double payment=principal*r/(1-Math.pow((1+r), -n));
		System.out.println(payment);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		System.out.println("enter the principal ammount");
		double principal=sc.nextDouble();
		System.out.println("enter the rate");
	double rate=sc.nextDouble();
		MonthlyPayment.payment(year,principal,rate);

	}

}
