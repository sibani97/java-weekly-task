package myFirstapp;

import java.util.Scanner;

//import com.sun.tools.jdeprscan.scan.Scan;

public class BinNibble {
    
static int swapNibbles(int x) 
{ 
  return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int x=sc.nextInt();
		// int x = 100; 
		    System.out.print(swapNibbles(x)); 

	}

}
