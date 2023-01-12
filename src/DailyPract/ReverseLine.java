package DailyPract;

import java.util.Scanner;

public class ReverseLine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the line");
		String s1 = "Hello World";
		
		
		
		String ReverseLine = "";
		
		String[] s = s1.split(" ");
		
		
		for(String w:s)
		{
			String reverseWord = "";
			
			for(int i=w.length() -1;i>=0;i--)
			{
				
				
				reverseWord=(reverseWord + w.charAt(i));
				
			}
			
			ReverseLine= (ReverseLine + reverseWord +" ");
			
			
		}
		System.out.println("Total words in reverse order :" +ReverseLine);
		
	}
		
		

}
