package test;

import java.util.function.Function;

public class FuncEg {

	public static void main(String[] args) {
		
		Function<String,Integer> f = s->s.length();
		System.out.println(f.apply("India"));
		Function <Integer,Integer> f1 =n-> {
				int fac=1;
				for(int i = 2;i<=n;i++) {
					fac=fac*i;
					
				}return fac;
		};
		System.out.println(f1.apply(5));
		
		Function<String,Integer> f2 = str->{
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					count++;
				}
				else {
					continue;
				}
			}return count;
		};
		System.out.println(f2.apply("asrewa"));
		Function<String,Integer> f3 = str1->{
			int count=0;
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)==' ') {
					continue;
				}
				else {
					count++;
				}
			}return count;
		};
		System.out.println(f3.apply("asda adsdasd asd"));
		
		Function<String,Boolean> f4 = str->{
			boolean flag=false;
			for(int i=0;i<str.length();i++) {
				if(str.length()<10) {
						flag = true;
				}
				else {
					continue;
				}
			}return flag;
		};
		System.out.println(f4.apply("sfgsdfsdfsdasd"));
	}

}
