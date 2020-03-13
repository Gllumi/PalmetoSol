package test;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = I->(I>10);
		Predicate<Integer> q = I1->(I1>20);
		Predicate<Integer> r = I2->(I2%2==0);
		Predicate<String> p1 = l->(l.length()>10);
		Predicate<Integer> p2 = t->{
			boolean temp = true;
			for(int i =2;i<t;i++) {
			
				if(t%i==0) {
					temp = false;
					break;
				}
				
			}return temp;
			
		};
		int[] x= {12,31,2,43,5,34};
		
		Predicate<String> p3 = k->(k.charAt(0)=='K');
/*and*/ System.out.println(q.and(r).test(21));
/*or*/  System.out.println(q.or(r).test(21));
		System.out.println(p.test(18));
		System.out.println(p1.test("guikii"));
		tes(p2.negate(), x);
		System.out.println(p2.test(17));
		System.out.println(p3.test("kasdsa"));
		//System.out.println(q.test(22));
		//System.out.println(r.test("kasdsa"));
	}
	public static void tes(Predicate<Integer>p, int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
