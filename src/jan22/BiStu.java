package jan22;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class TempEmp{
	String name;
	Double sal;
	public TempEmp(String name, Double sal) {
		// TODO Auto-generated constructor stub
		super();
		this.sal=sal;
		this.name=name;
	}
	/*public void Student(String name,String htno) {
		this.htno=htno;
		this.name=name;
		
	}*/
/*	@Override
	public String toString() {
		return "Name=" + name + ", Salary=" + sal ;
	}*/
}
public class BiStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<TempEmp> t=new ArrayList<TempEmp>(); 
		t.add(new TempEmp("aAs",1000.0));
		t.add(new TempEmp("asd",2000.0));
		t.add(new TempEmp("ASd",3000.0));
		t.add(new TempEmp("fgsd",4000.0));
		
		
		BiConsumer <TempEmp,Double> c = (e,d)->e.sal=e.sal+d;
		for(TempEmp e:t) {
			c.accept(e, 1000.0);
		}
		
		for(TempEmp e:t) {
			System.out.println(e.sal);
		}
		/*BiFunction<String,String,TempEmp> s = (htno,name)->new TempEmp(htno,name);
		TempEmp s1= s.apply("231", "Asd");
		System.out.println(s1);*/
	}

}
