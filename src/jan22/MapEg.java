package jan22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class Student{
	String name;
	int m1,m2;
	public Student(String name, int m1,int m2) {
		super();
		this.m1=m1;
		this.m2=m2;
		this.name=name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Name->" + name + ", M1->" + m1 + ", M2->" + m2 ;
	}
	public void con(Student st) {
		int temp = 0;
		if(st.m2<45) {
			temp = 1;
			System.out.println(temp);
		}
		else {
			System.out.println(temp);
		}
	}
}

public class MapEg {
	
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		//Student s = new Student();
		Student s1 = new Student("asd",65,45);
		Student s2 = new Student("qwe",84,25);
		Student s3 = new Student("sfd",23,85);
		Student s4 = new Student("zxc",61,95);
		Student s5 = new Student("vbc",75,35);
		Object h1 = hm.put("1", s1);
		Object h2 = hm.put("2", s2);
		Object h3 = hm.put("3", s3);
		Object h4 = hm.put("4", s4);
		Object h5 = hm.put("5", s5);
	//	hm.put("k2", "Afganistan");
		//hm.put("k3", "Balochistan");
		//Object h = hm.putIfAbsent("k1", "Qatar");
		//System.out.println(r);
		System.out.println(hm);
		Set entries =hm.entrySet();
		Iterator itr = entries.iterator();
		while(itr.hasNext()) {
			Map.Entry me =(Map.Entry)itr.next();
			Student t =(Student)me.getValue();
			if(t.m2<40) {
				System.out.println(me.getKey());
			}
		}
	
		
		
	}
	//public void condition(int m) {
		
			
	//	}
	}
