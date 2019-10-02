package com.piyush.ds.recursion.operation;

/**
 * 
 * @author Piyush Mittal
 *
 */
public class CharArrayPalindrome {
	
	
	public static void main(String[] args) {
		char a[]= {'a','a','b','b','a','a'};
		System.out.println(palindrome(a,0,a.length-1));
	}

	public static boolean palindrome(char a[],int start,int end)
	{
		if(start>=end)
			return true;
		else {
			if(a[start]!=a[end])
				return false;
			
			return palindrome(a,++start,--end);
		}
	}
	
}




