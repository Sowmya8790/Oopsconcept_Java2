package Practise;

import java.util.Scanner;

public class ArmstronNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		int Sum=0;
		int rem;
		int temp = n;
		
		
		
		while(n>0)
		{
			rem=n%10;
			Sum = Sum + (rem*rem*rem);
			n=n/10;
		}
		
		if(temp == Sum)
		{
			System.out.println("This is Armstrong");// 153 = 1^2 + 5^2 + 3^2  = 153
		}
		else
		{
			System.out.println("Not armstrong");
		}
			
	}
	
	
	//Adding count to the program
	
/*	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value");
	int value = scan.nextInt();
	int n = value;
	int count =0;
	int Sum = 0;		
	int rem;
	int temp = value;
	
	while(n>0) {
		n=n/10;
		count++;
	}
	System.out.println(count);
	
	while(value>0)
	{
		rem=value%10;
		Sum = (int) (Sum + (Math.pow(rem, count)));
		value=value/10;
		
	}
	
	if(Sum==temp) {
		System.out.println("The given number is armstrong :" +Sum + " " +temp );
	}
	else
	{
		System.out.println("The number is not armstrong : "  +Sum + " " +temp);
	}
	
	
	
	

}*/

}
