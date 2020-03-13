package assess3;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	String name;
	int mrks;
	
	public Student(String name, int mrks) {
		super();
		this.mrks=mrks;
		this.name=name;
	}

	@Override
	public String toString() {
		return "[Name=" + name + ", Marks=" + mrks+ "]" ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Jack",72);
		Student st2 = new Student("John",59);
		Student st3 = new Student("Joe",94);
		Student st4 = new Student("Jayce",39);
		ArrayList <Student> ar = new ArrayList();
		ar.add(st1);
		ar.add(st2);
		ar.add(st3);
		ar.add(st4);
		for(Student s:ar) {
			Predicate <Student> p = x->(s.mrks)<50; 
			Function <Student,String> f = z->{String sr ="";
							if(s.mrks>=80) {
								sr="Distinction";}
							else if(s.mrks>=60&&s.mrks<=79) {
								sr="First Class";
							}
							else if(s.mrks>=50&&s.mrks<=59) {
								sr="Second Class";
							}
							return sr;};
			
							
			if(p.test(s)==false) {
				System.out.println(s+ "  "+f.apply(s));
			}
		
		}
		}
		
		
	}


