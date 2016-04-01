package com.mycompany.mytest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CopyOfCopyOfSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner input = new Scanner(System.in);
    	 int size = input.nextInt();
    	 for(int m = 0; m < size; m++){
      	long N = input.nextInt();
    	String record = "-1";
    	for(long i5=0;i5<N+1; i5++)
    	{
    		long j3 = N-i5;
      		if(i5 % 3 == 0 && j3 % 5 ==0){
    			record = i5+" "+j3;
    		}
     	}
    	
 		StringBuilder sb = new StringBuilder();
		if(!"-1".equals(record)){
		String[] s = record.split(" ");
		  int i5 = Integer.parseInt(s[0]);
		  int j3 = Integer.parseInt(s[1]);
		  for(int x=0;x<i5;x++){
			  sb.append("5");
		  }
		  for(int x=0;x<j3;x++){
			  sb.append("3");
		  }
		  
		}else{
			 sb.append("-1");
		}
    	
		System.out.println(sb.toString());
		}
    }
 
    
    
   
}