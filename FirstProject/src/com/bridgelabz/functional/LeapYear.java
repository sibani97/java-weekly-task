package com.bridgelabz.functional;

import java.util.Scanner;

public class LeapYear {
	public static void leapyear(int yr)
	{
		if((yr%4==0)&&(yr%100!=0)||(yr%400==0))
		{
			System.out.println("it is a leapyear");
		}
		else
			System.out.println("not a leapyear");

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int yr=sc.nextInt();
		/*if((yr%4==0)&&(yr%100!=0)||(yr%400==0))
		{
			System.out.println("it is a leapyear");
		}
		else
			System.out.println("not a leapyear");

	}*/LeapYear.leapyear(yr);

}
}