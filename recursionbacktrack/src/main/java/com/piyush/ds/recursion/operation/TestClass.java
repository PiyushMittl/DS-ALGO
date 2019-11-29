package com.piyush.ds.recursion.operation;
import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        String s = br.readLine().trim();

        String out_ = Palindromic_Subsequence("abcd");
        
        System.out.println(out_);
//        wr.println(out_);
//
//        wr.close();
//        br.close();
    }

    static String Palindromic_Subsequence(String s) {
        // Your code goes here
        
         int i=0; 
    int j=s.length()-1;
 
    while(j>=0){
        if(s.charAt(i)==s.charAt(j)){
            i++;
        }
        j--;
    }
 
    if(i==s.length())
        return s;
 
    String suffix = s.substring(i);
    String prefix = new StringBuilder(suffix).reverse().toString();
    String mid = Palindromic_Subsequence(s.substring(0, i));
    return prefix+mid+suffix;

    }
}