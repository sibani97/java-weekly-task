package myFirstapp;

import java.util.Scanner;

public class CalenderWeek {
	public static  int dayweek(int year,int month,int day)
	{
		int y=year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m=month+12*((14-month)/12)-2;
		int day1=(day+x+31*m/12)%7;
		
		
		switch(day1)
		{
		case 0: day=0; 
       System.out.println("sunday");
        break;
		case 1: day=1; 
	       System.out.println("monday");
	        break;
		case 2: day=2; 
	       System.out.println("tuesday");
	        break;	
		case 3: day=3; 
	       System.out.println("wednesday");
	        break;	
		case 4: day=4; 
	       System.out.println("thursday");
	        break;
		case 5: day=5; 
	       System.out.println("friday");
	        break;
		case 6: day=6; 
	       System.out.println("saturday");
	        break;
		}
		
		

return day1;
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		System.out.println("enter the month");
		int month=sc.nextInt();
		System.out.println("enter the day");
				
		int day=sc.nextInt();
		int day1=CalenderWeek.dayweek(year, month, day);
	//	System.out.println(day1);
			
	}

}
