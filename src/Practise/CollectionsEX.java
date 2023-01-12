package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsEX {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		
		al1.add(10);
		al1.add(20);
		al1.add(5);
		al1.add(3);
		
		al.add("SOMI");
		al.add("JKL");
		al.add(10);
		al.add("uio");
		
		System.out.println(al);
		
		al.addAll(al1);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		System.out.println(al.contains(10));
		
		System.out.println(al1.containsAll(al));
		
		System.out.println(al.get(2));
		
		al.set(1, 900);
		System.out.println(al);
		
		System.out.println(al.equals(al1));
		
		al.indexOf(al1);
		System.out.println(al.indexOf("SOMI"));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		for(Object i:al)
		{
			System.out.println(i);
		}
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Collections.sort(al1);
		
		System.out.println(al1);
		
		Collections.shuffle(al1);
		
		System.out.println(al1);
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);

	}

}
