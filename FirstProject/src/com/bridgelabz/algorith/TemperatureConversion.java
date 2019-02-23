package com.bridgelabz.algorith;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 to convert Celsius to Fahrenheit:");
		System.out.println("enter 2 to convert  Fahrenheit to Celsius:");
		int choice=sc.nextInt();
		double converted=0.0;
		double temperature=0.0;
		if(choice==1)
		{
			System.out.println("enter the temperature in celsius");
			temperature=sc.nextDouble();
			converted=(temperature*9/5.0)+32;
			System.out.println("Temperature in fahrenheit"+converted);
		}
		else if(choice==2)
		{
			System.out.println("enter the temperature in celsius");
			temperature=sc.nextDouble();
			converted=(temperature-32)*5/9.0;
			System.out.println("Temperature in celsius"+converted);
		}
			

	}

}
