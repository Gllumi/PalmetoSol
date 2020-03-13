package cts;

//import java.util.ArrayList;
//import java.util.HashSet;
import java.util.TreeSet;





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
			return 1;
		}
		else if(name.compareTo(student.name)>0) {
			return -1;
		}
		else
			return 0;
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =new Student("1234","Aasd");
		Student s2 =new Student("1235","Bsd");
		Student s3 =new Student("1236","Fsad");
		TreeSet list=new TreeSet();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
	}

}