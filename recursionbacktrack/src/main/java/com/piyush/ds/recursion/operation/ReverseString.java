package com.piyush.ds.recursion.operation;

import java.util.Arrays;

/**
 * 
 * @author Piyush Mittal
 *
 */
public class ReverseString {
	
	
	// Java implementation of the approach 

		// Function to return the lexicographically 
		// smallest string of length n that 
		// satisfies the given condition 
		public static /*char[]*/ String lexo_small(int k, int n) 
		{ 
			char arr[] = new char[n]; 

			Arrays.fill(arr, 'a'); 

			// Iteration from the last position 
			// in the array 
			for (int i = n - 1; i >= 0; i--) { 

				k -= i; 

				// If k is a positive integer 
				if (k >= 0) { 

					// 'z' needs to be inserted 
					if (k >= 26) { 
						arr[i] = 'z'; 
						k -= 26; 
					} 

					// Add the required character 
					else { 
						arr[i] = (char)(k + 97 - 1); 
						k -= arr[i] - 'a' + 1; 
					} 
				} 

				else
					break; 

				k += i; 
			} 

			return new String(arr); 
		} 

		// Driver code 
		public static void main(String[] args) 
		{ 
			int n = 5, k = 42; 

			//char arr[] = lexo_small(n, k); 
			String ss = lexo_small(k, n);
			System.out.print(ss);
			//System.out.print(new String(arr)); 
		} 
	} 


