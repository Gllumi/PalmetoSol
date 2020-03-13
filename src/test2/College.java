package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Emp{
	String name;
	
	
	public Emp(String name){
		super();
		this.name=name;
	}
}

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> ar = new ArrayList<Emp>();
		Map<Integer,Emp> m = new HashMap<Integer,Emp>();
		m.put(1001, new Emp("Asd"));
		m.put(1002, new Emp("asg"));
		m.put(1003, new Emp("asF"));
		
		Set entries = m.entrySet();
		Iterator itr = entries.iterator();

		
		while(itr.hasNext()) {
			Map.Entry m1 =(Map.Entry)itr.next();
			Emp i = (Emp)m1.getValue();
			char c1 = i.name.charAt(0);
			char c2 = i.name.charAt(i.name.length()-1);
			if(c1>=97 && c1<=123 && c2>=65 && c2<=97) {
				//ar.addAll(i.name);
				//System.out.println(m1.getKey());
			}
			
			for (Emp c:ar) {
				
			}
			
			
		}
			
	}

}
