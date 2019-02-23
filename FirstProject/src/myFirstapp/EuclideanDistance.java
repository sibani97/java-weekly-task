package myFirstapp;

import java.util.Scanner;

public class EuclideanDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ox=0.0;
		double oy=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double x=sc.nextInt();
		System.out.println("enter the 2nd number");
		double y=sc.nextInt();
		double eucdist=distance(x, y);
		System.out.println(eucdist);

	}
	public static double distance(double ax,double ay)
	{
		double dx=Math.pow(ax, 2);
		double dy=Math.pow(ay, 2);
		double dist=Math.sqrt(dx+dy);
		return dist;
	}

}
