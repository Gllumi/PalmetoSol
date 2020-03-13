package test2;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class CollectionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add("Java");
		ar.add("DotNet");
		ar.add("Selenium");
		ar.add("Oracle");
		ar.add("RedHat");
		
		
		
	/*	int temp =Collections.binarySearch(ar, "DotNet");
		System.out.println(temp);
		if(temp==1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}*/	 	 	 	 	 	 	
		
		
		ar.forEach(System.out::println);		
		System.out.println(ar.get(2));
		ar.set(1, "JavaScript");
		System.out.println(ar);
		ar.remove(3);
		System.out.println(ar);
		
		ArrayList ar2 = new ArrayList();
		ar2.add("Java");
		ar2.add("DotNet");
		ar2.add("Selenium");
		
		
		
		ar.retainAll(ar2);
		System.out.println(ar);
		
		Collections.sort(ar);
		System.out.println(ar);
		
		Collections.reverse(ar);
		System.out.println(ar);
		
		
		Collections.fill(ar, "Python");
		System.out.println(ar);
		
		ar2.add(2,"Python");
		System.out.println(ar2);
		
		boolean flag = Collections.disjoint(ar,ar2);
		System.out.println(flag);
		
		Scanner ac = new Scanner(System.in);
		int n=ac.nextInt();
		System.out.println(ar.get(n));
	
	}
	

}
/**/
