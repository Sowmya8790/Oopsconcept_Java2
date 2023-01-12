package OOPS;

public class Methodex2 {
	
	int a;
	int b;
	//// Method does take parameters
	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public static void main(String args[])
	{
		Methodex2 sum1=new Methodex2();
		sum1.sum(100,200);
	}
	
}
