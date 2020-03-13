package jan22;

import java.util.PriorityQueue;
import java.util.function.BiConsumer;

public class BiConsumerEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> c=(a,b)->System.out.println(a+b);
		c.accept("Hello", " World");
	//Integer
		PriorityQueue d=new PriorityQueue();
		d.add(12);
		d.add(43);
		d.add(13);
		d.add(10);
		d.add(23);
		System.out.println(d);
		d.remove();
		System.out.println(d);
		d.add(34);
		System.out.println(d);
		
		//Integer
				PriorityQueue d1=new PriorityQueue();
				d1.add("asd");
				d1.add("fgas");
				d1.add("asrqw");
				d1.add("wed");
				d1.add("asda");
				System.out.println(d1);
				d1.remove();
				System.out.println(d1);
				d1.add("kijdf");
				System.out.println(d1);
	
	}
	

}
