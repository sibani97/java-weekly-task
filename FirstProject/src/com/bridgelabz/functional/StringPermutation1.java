package com.bridgelabz.functional;



public class StringPermutation1 {

	public static void permutation(String st,int l,int r) 
	{
		if(l==r)
			System.out.println(st);
		else
		{
			for(int i=l;i<=r;i++)
			{
				st=swap(st,l,i);
				permutation(st, l+1, r);
				st=swap(st, l, i);
			}
		}
	}
	public static String swap(String a,int i,int j) 
	{
		char tem;
		char[] carr=a.toCharArray();
		tem=carr[i];
		carr[i]=carr[j];
		carr[j]=tem;
		return String.valueOf(carr);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 { 
		        String str = "ABC"; 
		        int n = str.length(); 
		        StringPermutation permutation = new StringPermutation(); 
		        permutation.permute(str, 0, n-1); 
		    } 

	}

}
