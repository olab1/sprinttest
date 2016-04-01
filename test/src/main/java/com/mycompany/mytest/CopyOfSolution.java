package com.mycompany.mytest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CopyOfSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner input = new Scanner(System.in);
     	int baseSize = input.nextInt();
     	long[] base = new long[baseSize];
     	
     	for(int i=0; i< baseSize;i++){
     		base[i] = input.nextLong();
     	}
     	 
     	int querySize =  input.nextInt();
     	long[] query =  new long[querySize];
     	for(int i=0; i< querySize;i++){
    		query[i] = input.nextLong();
    	}
    	
//    	 long[] base = new long[]{-1,2,-3};
//     	int baseSize = base.length;
//     	long[] query =  new long[]{1,-2,3};
//     	int querySize = query.length;
    	//calculate(0,  query,  base );
    	
		for (int i = 0; i < querySize; i++) {
			long total = 0;
	    	int index = 0;
	        long totaltotal =subCalculate(  index,   query[i],  base,  total);
	    	System.out.println(totaltotal);
		}
    }
 
    
    private static void  calculate(int i, long[] query,long[] base ){
    	if(i==query.length){
    		return;
    	}
    	
    	long total = 0;
    	int index = 0;
        long totaltotal =subCalculate(  index,   query[i],  base,  total);
    	System.out.println(totaltotal);
    	i++;
    	calculate(i, query,base);
    }
    
    private static long subCalculate(int index, long query,  long[] base,long total){
    	if(index == base.length){
    		return total;
    	}
    	
    	    long subTotal = base[index]+query;
			total += Math.abs(subTotal);
			base[index]= subTotal;
 			index++;
			return subCalculate(  index,   query,    base,  total);
    }
    
    /* public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
    	 Scanner input = new Scanner(System.in);
    	int baseSize = input.nextInt();
    	long[] base = new long[baseSize];
    	
    	for(int i=0; i< baseSize;i++){
    		base[i] = input.nextLong();
    	}
    	 
    	int querySize =  input.nextInt();
    	long[] query =  new long[querySize];
    	for(int i=0; i< querySize;i++){
    		query[i] = input.nextLong();
    	}
    	
    	
    	long[] newBase =base;
    	for(int i=0; i<querySize;i++){
        	int total = 0;
        	int index = 0;
        	for(long num: newBase){
        		long subTotal = num+query[i];
     			total += Math.abs(num+query[i]);
    			newBase[index++]= subTotal;
    		}
     		System.out.println(total);
    	}
    	 */
    	
   
}