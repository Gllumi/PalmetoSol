package jan22;

import java.util.function.BiFunction;


public class BiFunctionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> f = (a,b)->(a+b);
		BiFunction<Integer,Integer,Integer> f1 = (a,b)->(a-b);
		System.out.println(f.apply(10, 40));
		System.out.println(f1.apply(40, 10));
	}

}
