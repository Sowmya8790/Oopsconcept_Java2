package Practise;

import java.util.Scanner;

public class Pract {
	
	public static void array(String name) {
		
		String n="";
	 
			char a[] = name.toCharArray();
			for(int i=0;i<=name.length()-1;i++) {
				
				 n= (n+a[i]);
				 System.out.print(n);
			}
			
		}
		
	public static void main(String[] arg) {
	
		array("Sowmya");
	
	}
	
}
