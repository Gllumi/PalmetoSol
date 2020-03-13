package test;

import java.util.function.Supplier;

public class SupplierEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = ()->{
			String[] s1= {"asd","qwe","qwer","qwerty","zxc"};
			int x = (int)(Math.random()*5);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
