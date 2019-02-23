//created by: sibani barui

//Date 22/02/2019
//Purpose: Windchil program.gives the input which are the temperature and speed,we will get windchill as a output.
package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
	public static void windchill(double t,double v)
	{
		if(t>50||v>120||v<3)
		{
			System.out.println("is not valid");
		}
		else
		{
			double w=35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16);
			System.out.println("Temperature"+"  "+t);
			System.out.println("wind speed"+"  "+v);
			System.out.println("Windchill"+"  "+w);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("give the Fahrenheit temperature");
		double t=sc.nextDouble();
		System.out.println("give the speed");
		double v=sc.nextDouble();
		WindChill.windchill(t,v);

	}

}
