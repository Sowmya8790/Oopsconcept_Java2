package Practise;

public class Swapping_numbers {

	public static void main(String[] args) {
	
		int a=100;
		int b=200;
		System.out.println("Enter the value of a and b  "+a+" "  +b);
		
	/*	int c = 0;
		c=a;
		a=b;
		b=c;
		System.out.println("Enter the value of a and b  "+a+" "  +b);*/
		
		//approch 2 
		a = a+b; //100+200 = 300
		b= a-b; // 300-200 = 100
		a =a-b; //300-100 =200
		System.out.println("Enter the value of a and b  "+a+" "  +b);

		//approch 3
		a = a*b;
		b= a/b;
		a=a/b;
		
		System.out.println("Enter the value of a and b  "+a+" "  +b);
		

	}

}
