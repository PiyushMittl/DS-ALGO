package com.piyush.ds.recursion.operation;

/**
 * 
 * @author Piyush Mittal
 *
 */
public class CopyString {
	
	
	public static void main(String[] args) {
		String s1="hello";
		System.out.println(copy(s1,"",0));
	}

	public static String copy(String s1,String s2,int index)
	{
		if(index==s1.length())
			return s2;
		else {
			s2=s2+s1.charAt(index);
			return copy(s1,s2,++index);
		}
	}
	
}




