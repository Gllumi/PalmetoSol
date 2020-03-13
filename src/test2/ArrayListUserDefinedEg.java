package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
	String htno;
	String name;
	Student(String htno, String name){
		this.name=name;
		this.htno=htno;
	}
	@Override
	public String toString() {
		return "htno=" + htno + ", name=" + name ;
	}
	@Override
	public int compareTo(Student student) {
		if(name.compareTo(student.name)<0) {
			return -1;
		}
		else if(name.compareTo(student.name)>0) {
			return 1;
		}
		else
			return 0;
	}
}
class Employee{
	String empno;
	String name;
	Employee(String empno, String name){
		this.name=name;
		this.empno=empno;
	}
	@Override
	public String toString() {
		return "empno=" + empno + ", name=" + name ;
	}
}
public class ArrayListUserDefinedEg {

	public static void main(String[] args) {
		Student s1 =new Student("1234","Aasd");
		Student s2 =new Student("1235","asd");
		Student s3 =new Student("1236","Fsad");
		ArrayList list=new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Employee e1=new Employee("4321","qweq");
		Employee e2=new Employee("4322","sdfa");
		Employee e3=new Employee("4323","fafg");
		ArrayList list2=new ArrayList();
		list2.add(e1);
		list2.add(e2);
		list2.add(e3);
		System.out.println(list2);
/*add*/	list.add(list2);
		System.out.println("Using add function");
		System.out.println(list);
/*remove*/list.remove(list2);
		System.out.println("Using remove function");
		System.out.println(list);
/*addAll*/list.addAll(list2);
		System.out.println("Using addAll function");
		System.out.println(list);
		
		/*Iterator*/
		Iterator itr = list.iterator();
		System.out.println("Using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Collections.sort(list);
		System.out.println(s1.compareTo(s1));
		
		//forEach is collection iterator method
		//list.forEach(System.out::println); //  (Java 1.8)
	
	}
	

	
}
