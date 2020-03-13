package test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Admission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Year");
			
			int year = sc.nextInt();
			System.out.println("Enter Admission");
			int add = sc.nextInt();
			m.put( year, add);
		}
		System.out.println(m);
		Set entries = m.entrySet();
		
		Iterator itr = entries.iterator();
		int y=0;
		int max = 0;
		int e=0;
		while(itr.hasNext()) {
			Map.Entry m1 =(Map.Entry)itr.next();
			e = (Integer)m1.getValue();
			if(e>max) {
				max=e;
				y=(Integer)m1.getKey();
			}
		
		}
		System.out.println("Max Admissions in");
		System.out.println(y+ " " +max);
	}
}