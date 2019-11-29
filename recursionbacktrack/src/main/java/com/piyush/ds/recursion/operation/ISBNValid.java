package com.piyush.ds.recursion.operation;

//import for Scanner and other utility classes
import java.util.Scanner;


/*
 * Harry wants to find Voldemort's potion making book but he is confused about how to get it.
The book has a special ISBN(International Standard Book Number) which is  unique numeric book identifier only for Voldemort's book printed on it. The ISBN is based upon a 10-digit code. The ISBN is valid if:
1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.
Help Harry to find the book!
Input:
 Input the ISBN code as a 10-digit integer.
Output:
If the ISBN is not a 10-digit integer, output the message “Illegal ISBN” and terminate the program.
If the number is 10-digit, extract the digits of the number and compute the sum as explained in the explanation.
If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11, output the message, “Illegal ISBN”.


Explanation 
For an ISBN 1401601499
Sum=1×1 + 2×4 + 3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.
 * 
 * */


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class ISBNValid {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();  
        
        if(name.length()==10)
        {
        System.out.println(ISBN(Integer.parseInt(name),10,0,0));    // Writing output to STDOUT
}
else{
    System.out.println("Illegal ISBN");    // Writing output to STDOUT
}
        // Write your code here

    }
    
    public static String ISBN(int num,int lastDigit,int index,int sum){
        
        if(index==0 && sum%11==0){
        return "Legal ISBN";
        }else if(index==0 && sum%11!=0)
        {
            return "Illegal ISBN";
        }
        else{
         lastDigit=num%10;
         num=num/10;
         sum=(index*lastDigit)+sum;
         return ISBN(num,--lastDigit,index,sum);
        }
    }
    
    
}
