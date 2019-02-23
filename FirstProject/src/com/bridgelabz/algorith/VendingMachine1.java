package com.bridgelabz.algorith;

import java.util.Scanner;

public class VendingMachine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1000,500,100,50,10,5,2,1};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter amount of money");
		int money=sc.nextInt();
		VendingMachine1.vending(arr, money);
	}
	public static void vending( int arr[], int money)
	{
		int rem, i=0,total=0;
		//int money = 0;
		if(money==0)
		{
			System.out.println("-1");
		}
		else
		{
			for(i=0;money>=arr[i];i++)
			{
				int calnote=money/arr[i];
				rem=money%arr[i];
				money=rem;
				total+=calnote;
				//int total;
				System.out.println(arr[i]+"-----Notes"+calnote);
				
			}
			//i++;
			System.out.println(total);
			//return vending(money,arr);
		}
	}
}
