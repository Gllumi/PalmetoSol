package cts4;
import java.util.Scanner;
import java.util.TreeSet;



interface  Examp{
	//int x=67;
	 void meth1() ;
	// 
	
}
interface  Examp3{
	//int x=67;
	 int meth2(int a, int b) ;
	// 
	
}



class Examp2{
	public static void meth3() {//static method
		System.out.println("Some Text 3");
	}
}


public class Example {
	public static void main(String[] args) {
		Examp m = ()->System.out.println("Some Text 1");
/*LambdaExp*/Examp3 n = (a,b)->a*b;
		System.out.println(n.meth2(10,20));
		m.meth1();
		
/*Static*/Examp2.meth3();

/*Runnable*/Runnable runnable = () -> System.out.println("Runnable Thread");
	    Thread t = new Thread(runnable);
	    t.start();
	    System.out.println("Enter Two Numbers");
	    Scanner sc = new Scanner (System.in);
	    int r=sc.nextInt();
	    int s=sc.nextInt();
	    int p;
/*Exception*/try {
	    	p=r/s;
	    	System.out.println(p);
	    }
	    catch(ArithmeticException e) {
	    	System.out.println("Error:"+e);
	    	
	    }//exception (try/catch) is an object that describes the exception condition that occurred 
	    //in a piece of code
	    
	    
/*TreeSet*/TreeSet tr = new TreeSet();
           
           tr.add(5);
           tr.add(15);
           tr.add(43);
           tr.add(12);
	   System.out.println(tr);
	}
	 
	
}

/*class inClass implements Examp{
	public void meth1() {
		System.out.println("Some Text1 "+x);
	}

	
	public void meth2() {
		System.out.println("Some text2");
		
	}
}*/

