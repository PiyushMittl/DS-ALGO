package com.piyush.ds.recursion.operation;

/**
 * 
 * @author Piyush Mittal
 *
 */
public class PalindromeString {
	
	
	public static void main(String[] args) {
		String s1="aba";
		System.out.println(palin(0,s1.length()-1,s1));
	}

	public static String palin(int start,int end,String str)
	{
		if(start>=end)
			return "YES";
		else
			if(str.charAt(start)!=str.charAt(end))
				return "NO";
		
		return palin(++start,--end,str);
	}
	
}




