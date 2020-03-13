package cts4;

import java.util.Scanner;

public class Demo extends First.one implements Inner.two{
	
	public void greater(int a, int b) {
		int h;
		h = (a>b)?a:b;
		System.out.println(h);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		InnerDemo obj1=new InnerDemo();
		Fibo obj2 = new Fibo();		
		int c=sc.nextInt();
		int d=sc.nextInt();
		Demo obj = new Demo();
		obj.greater(c, d);
		obj.disPlay();
		obj1.disp();
		int n=sc.nextInt();
		for (int i =0;i<n;i++) {
		    System.out.println(obj2.fibon(i));
		}
		GenericDemo<String,Integer> obj3=new GenericDemo<String,Integer>("Generic",89);
		//String x = (String)obj3.displa();
		//String y = (String)obj3.displb();
		//System.out.println(x+" "+y);
		obj3.dplay();
	}

}
class GenericDemo<A,B>{
	A a;
    B b;
    
    public GenericDemo(A string, B string2) {
		// TODO Auto-generated constructor stub
    	a = string;
    	b = string2;
	}
	public void dplay() {
		// TODO Auto-generated method stub
		System.out.println(a+" "+b);
		
	}
	public A displa() {
    	return  (a);
		
    }
    public B displb() {
    	return  (b);
		
    }
}
class Fibo{
	public  int fibon(int i) {
		
		
			
			if (i==0||i==1) {
				return i;
				//System.out.println(i);
			}
			else {
				return(fibon(i-1)+fibon(i-2));
				//System.out.println(fibon(i-1)+fibon(i-2));
			}
		
				
	}
}

interface First{
	 
	public class one{
		public void disPlay() {
		 System.out.println("Class in Interface");
	 }
	}
 }
 class Inner{
	interface two{
		public void greater(int a,int b);
	}
}
 
 class InnerDemo{
		class three{
			public int fact(int a) {
				int f;
				if(a==0 || a==1)
					return 1;
				else
					f= a *fact(a-1);
				 return f;
			}
		}
		public void disp() {
			three ob = new three();
			System.out.println(ob.fact(5));
		}
	}
 
 