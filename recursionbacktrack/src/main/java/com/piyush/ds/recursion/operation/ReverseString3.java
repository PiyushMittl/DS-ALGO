package com.piyush.ds.recursion.operation;

/**
 * 
 * @author Piyush Mittal
 *
 */
public class ReverseString3 {
	
	
	public static void main(String[] args) {
		String s1="hello";
		System.out.println(rev(s1,"",-1));
	}

	public static String rev(String s1,String s2,int index)
	{
		if(index==s1.length()-1)
			return "";
		else
			s2=rev(s1,s2,++index);
		s2=s2+s1.charAt(index);
		return s2;
	}
	
}




