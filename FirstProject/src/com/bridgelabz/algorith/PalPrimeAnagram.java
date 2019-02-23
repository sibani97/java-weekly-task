package com.bridgelabz.algorith;

import com.bridgelabz.utility.Utility;

public class PalPrimeAnagram {

	public boolean prime (int n)
	{ 
		
		int c=0;
		
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}

				if(c==2)
				//if(i==2)
					return true;
				
				else
					return false;
			}
	
			
		
	
	public boolean palindrome(int n) {
		int rev=0;
		int tem=n;
		while(tem!=0)
		{
			rev=rev*10+(tem%10);
			tem=tem/10;
		}
		if(rev==n)
		{
			return true;
		}

		return false;

	}
	public boolean anagram(int n)
	{
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		int no=Utility.singleIntrgerInput();
		PalPrimeAnagram pp=new PalPrimeAnagram();
		if(pp.prime(no)==true && pp.palindrome(no)==true && pp.anagram(no))
		{
			System.out.println("it is palindrome and prime and anagram");
		}else
			System.out.println("it is not palindrome and prime and anagram");

	}


}
