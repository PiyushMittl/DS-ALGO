package com.piyush.ds.arrays.operation;

/**
 * 
 * @author Piyush Mittal
 *
 */
class MaximumSum 
{ 
	/*Function to return max sum such that no two elements 
	are adjacent */
	int FindMaxSum(int arr[], int n) 
	{ 
		int i; 
		int temp,n_1=arr[0],n_2=0;

		for (i = 1; i < n; i++) 
		{ 
			temp=n_1;
			n_1 = (n_1 > (n_2+arr[i])) ? n_1 : (n_2+arr[i]);
			n_2=temp;
		} 

		/* return max of incl and excl */
		return ((n_1 > n_2) ? n_1 : n_2); 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		MaximumSum sum = new MaximumSum(); 
		int arr[] = new int[]{5, 5, 10, 100, 10, 5}; 
		System.out.println(sum.FindMaxSum(arr, arr.length)); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 
