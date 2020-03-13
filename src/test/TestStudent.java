package test;

import java.util.ArrayList;
import java.util.function.Function;

class Student {
	String name;
	int mrks;
	public Student(String name,int mrks) {
		super();
		this.mrks=mrks;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Name:" + name + ", Marks:" + mrks ;
	}

}


public class TestStudent{
	public static void main(String[] args) {
		
		Student st1 = new Student("Ajay",78);
		Student st2 = new Student("Vijay",58);
		Student st3 = new Student("Jay",98);
		
		Function<Student,String> f1 = st->{
			if(st.mrks>=90) {
				System.out.println("Passed with A grade");
			}
			else if(st.mrks>=80) {
				System.out.println("Passed with B grade");
			}
			else if(st.mrks>=60) {
				System.out.println("Passed with C grade");
				
			}
			else if(st.mrks>=40) {
				System.out.println("Passed with D grade");
			}
			else {
				System.out.println("Failed");
			}
			return st.name;
		};
		//System.out.println(f1.apply(st2));
		ArrayList list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		Display(f1,list);

	}
	public static void Display(Function<Student,String> f,ArrayList<Student> list) {
		for (Student e:list) {
			if(f.apply(e) != null) {
				System.out.println(e);
			}
		}
	} 
	
}

	

