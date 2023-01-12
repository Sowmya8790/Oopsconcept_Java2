package Practise;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =scan.nextInt();
		
		int sum=0;
		
		while(num>0) {
			
			sum=sum*10 + num%10;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
