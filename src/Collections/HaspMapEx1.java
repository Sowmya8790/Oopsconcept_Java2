package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HaspMapEx1 {

	public static void main(String[] args) {
		
	//	HashMap m = new HashMap();
		
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(101, "PTY");
		m.put(102, "SJO");
		m.put(103, "LAX");
		m.put(104, "IAH");
		m.put(105, "HAV");
		//m.put(102, 100);
		
		System.out.println(m); //{101=PTY, 102=SJO, 103=LAX, 104=IAH, 105=HAV, JACK=100}
		                        //{101=PTY, 102=100, 103=LAX, 104=IAH, 105=HAV}
		
		System.out.println(m.get(105));
		m.remove(101,"PTY");
		
		System.out.println(m);
		
		m.containsKey(105);
		System.out.println(m.containsKey(105));
		
		System.out.println(m.containsValue("PTY"));
		
		System.out.println(m.isEmpty());
		
		//More commands
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		for(Object i :m.keySet())
		{
			System.out.println(i+" "+m.get(i));
		}
		
		
		for(Object i :m.values())
		{
			System.out.println(i);
		}
		
		//inside haspmap there is entry map
		
	/*	for(Map.Entry i:m.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		*/
		//iterator Method
		
		Set s=m.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	
		
		
	}

}
