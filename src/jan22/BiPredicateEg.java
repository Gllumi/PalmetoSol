package jan22;

import java.util.function.BiPredicate;

public class BiPredicateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> bi=(a,b)->(a+b)%2==0;
		System.out.println(bi.test(10, 2));
		System.out.println(bi.test(3, 2));
	}

}
