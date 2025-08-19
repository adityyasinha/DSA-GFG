//Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order.

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
		    String s = sc.next();
		    
		    char[] arr = s.toCharArray();
		    
		    Arrays.sort(arr);
		    
		    System.out.println(new String(arr));
		}
		sc.close();
	}
}