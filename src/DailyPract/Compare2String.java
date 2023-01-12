package DailyPract;

import java.util.Scanner;

public class Compare2String {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string value");
		String s1 = scan.next();
		System.out.println("Enter the second string value");
		String s2 = scan.next();
		String temp = "" ;
		
		if(s1.length()==s2.length()) {
			
			System.out.println("Here S1 and S2 ae equal");
			
			for(int i=0;i<s1.length();i++) {
				
				if(s1.charAt(i)==s2.charAt(i)) {
					
					temp = temp+s1.charAt(i);
				}
				else
				{
					System.out.println("After verifying the String are not same");
				}
			}
			
		}
			else {
				
				System.out.println("Both the string are different");
			
			
		}
		
	System.out.println("The temp Value is :" +temp);
		
		

	}

}
