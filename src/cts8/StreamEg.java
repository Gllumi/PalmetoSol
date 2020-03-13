package cts8;
import java.util.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Product{
	 int id;
	 String name;
	 double price;
	 public Product(int id,String name,double price) {
		 super();
		 this.id=id;
		 this.name=name;
		 this.price=price;
	 }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class StreamEg {

	public static void main(String[] args) {
		//List<Integer> li = Array.asList(13 , 5, 7, 9, 11);
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Apple",60000);
		Product p2=new Product(1002,"Samsung",55000);	
		Product p3=new Product(1003,"Lenovo",40000);
		Product p4=new Product(1004,"Acer",35000);
		Product p5=new Product(1005,"Asus",45000);
		Product p6=new Product(1006,"Apple",55000);
		Product p7=new Product(1007,"Samsung",39000);
		
		
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		Product l = products.stream()
				.filter( p->p.name.equals("Apple"))
				//.sorted();
				.min((Product a , Product b)->a.price<b.price?-1:1)
				.get();
		Double sum=products.stream()
				.collect(Collectors.summingDouble(x->x.price));
	//	Double sum1=products.stream()
		//		.collect(Collectors.averagingInt(x->x.name.equals("Apple")));
		
				//.map(p->p)
				//.collect(Collectors.toList());
		//long cnt =products.stream().max((Product a , Product b)->p.price>=40000).count();
		System.out.println(l);
		System.out.println(sum);
		//System.out.println(sum1);
		//l.forEach(System.out::println);
		
	}

}
