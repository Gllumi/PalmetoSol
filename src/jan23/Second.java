package jan23;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	       // int n = s.length();
	       // char[] cr = new char[n];
	        //char c=' ';
	        //int count=0,count1=0;
	        int[] count = new int[256]; 
	        
	        /* Count array with frequency of characters */
	        int i; 
	        for (i = 0; i < s.length(); i++) 
	            if(s.charAt(i)!=' ') 
	                count[(int)s.charAt(i)]++; 
	        int n = i; 
	       
	        // Print characters having count more than 0 
	        for (i = 0; i < n; i++) 
	            if (count[(int)s.charAt(i)] == 1) 
	                System.out.println(s.charAt(i));
	                }
	}


