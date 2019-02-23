//created by: sibani barui

//Date 22/02/2019
//Purpose:Computes the prime factorization of N using brute force.
package com.bridgelabz.functional;

//import com.bridgelabz.utility.Utility;

public class StringPermutation {
	//private static final String String = null;

	private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
	public String swap(String a, int i, int j) 
    { 
        char tem; 
        char[] charArray = a.toCharArray(); 
        tem = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = tem; 
        return String.valueOf(charArray); 
    } 
  

  
	

	 public static void main(String[] args) 
	    { 
	        String str = "ABC"; 
	        int n = str.length(); 
	        StringPermutation permutation = new StringPermutation(); 
	        permutation.permute(str, 0, n-1); 
	    } 
	}


