package com.mycompany.mytest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/* Head ends here */
	static long stringSimilarity(String a) {
    	char[] base = a.toCharArray();
    	char[] testString = a.toCharArray();
    	
    	int precheckIndex = 1;
     	long total = base.length;
    	for(int i=1;i<base.length;i++){
    		if(base[0] == base[i]){
    			precheckIndex++;
    		}else{
    			break;
    		}
    	}
    	
     	int begin = precheckIndex;
     	begin --;
      	while(begin> 0){
     		//begin --;
    		total = total +  begin;
    		begin--;
    	}
     	
     	System.out.println(total+" total "+precheckIndex);
     	
    	for(int i=precheckIndex; i<base.length; i++){
    		int current = i;
    		int baseCurrent = 0;
    		while(current< base.length && testString[current]==base[baseCurrent]){	 
	    			baseCurrent++;
	    			current ++;
    		}
    		total = total+baseCurrent;
    	}
    	
        return total;
    }

	/* Tail starts here */
	public static void main(String[] args) {
		
		double mb = 1024*1024;
        
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
        long t0 = System.nanoTime();
         
       
        System.out.println("##### Heap utilization statistics [MB] #####");
        String s = "abbdaedeeeedeaeeabcabbadbebedcedaadabbbddbbebdabecdcbdcc";// 11
		String s1 = "cddddabbaeaccaabedebbaaeabccecddcdbaaecbeeadeaeadabeddadaccbcdeebcacceaddabccdccaaddddd"; // 3
		String s2 = "bbeeabcadeecbcadae"; // 3
		String s3 = "aaaaagbh";
		String s4="ababaa";
		System.out.println(stringSimilarity(s));
		System.out.println(stringSimilarity(s1));
		System.out.println(stringSimilarity(s2));
		System.out.println(stringSimilarity(s3));
		System.out.println(stringSimilarity(s4)); 
		 long t1 = System.nanoTime();
	        System.out.println("Elapsed time =" +(double) (t1 - t0)   / 1000000000.0
	            + " seconds");
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
		
		

	}
}