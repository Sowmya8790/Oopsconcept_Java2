package OOPS;

class Vehicle
{
	void runner()
	{
		System.out.println("Vehicle is running");
	}
}

class VESPA extends Vehicle
{
	void run()
	{
		System.out.println("VESPA is running");
	}
}

class KTM extends VESPA
{
	void runfast()
	{
		System.out.println("KTM is running");
	}
}

public class Hirarchicalex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vehicle v1=new Vehicle();
 v1.runner();
 VESPA v2=new VESPA();
 v2.runner();
 v2.run();
 KTM v3=new KTM();
 v3.runfast();
 v3.runner();
 v3.run();
 
 
	}

}
