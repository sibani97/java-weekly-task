package com.bridgelabz.algorith;

import com.bridgelabz.utility.Utility;

public class GuessesResult {
	public static int guessresult(int low,int high)
	{	//int n=Utility.singleIntrgerInput();
		int mid=0;
		while(low!=high)
		{
			mid=low+high/2;
			System.out.println("enter true number is between"+low+" "+mid+"\tenter false number is between"+(mid+1)+" "+high);
			//System.out.println("enter false number is between"+(mid+1)+" "+high);
			boolean b=Utility.singleBooleanInput();
			if(b)
			{
				high=mid;
			}else
				low=mid+1;
			
		}
		return low;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("enter the  lower number");
		int lo=Utility.singleIntrgerInput();
		System.out.println("enter the  heigher number");
		int hi=Utility.singleIntrgerInput();
		//GuessesResult.guessresult(lo,hi);
		System.out.println("guesses value is:"+"  "+guessresult(lo, hi));
		
		

	}

}
