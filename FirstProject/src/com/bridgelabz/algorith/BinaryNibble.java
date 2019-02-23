package com.bridgelabz.algorith;

import java.util.Scanner;

//import com.bridgelabz.utility.Utility;



public class BinaryNibble {
	public static int nibbleswap(int no)
	{
		//int no=Integer.parseInt(st);
		return ((no & 0x0F) << 4 | (no & 0xF0) >> 4);
			
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int no=Utility.singleIntrgerInput();
		System.out.println("enter the decimal no");
		int no=sc.nextInt();
		
		
		System.out.println(BinaryNibble.nibbleswap(no));
		
		

	}

}
