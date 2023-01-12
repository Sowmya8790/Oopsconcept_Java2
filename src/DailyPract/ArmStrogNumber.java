package DailyPract;

import java.util.Scanner;

public class ArmStrogNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
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
		
		
		
		

	}

}
