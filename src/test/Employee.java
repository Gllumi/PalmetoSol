package test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	String name;
	String des;
	int sal;
	String city;
	public Employee(String name,String des,int sal,String city) {
		super();
		this.city=city;
		this.des=des;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "[" + name + "," + des + "," + sal + "," + city + "]";
	}

	
	/*public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(name.equals(e.name)) {
			return true;
		}
		else {
			return false;
		}
	}*/

	public static void main(String[] args) {
			Employee emp1 = new Employee("asd","Manager",56000,"Bangalore");
			Employee emp2 = new Employee("asd","Developer",25000,"Chennai");
			Employee emp3 = new Employee("bsd","Manager",56000,"Hyderabad");
			Employee emp4 = new Employee("fsd","Developer",25000,"Bangalore");
			Employee emp5 = new Employee("ghs","Team Lead",40000,"Chennai");
			Employee emp6 = new Employee("afd","Sr.Developer",30000,"Bangalore");
			Employee emp7 = new Employee("asa","Manager",56000,"Hyderabad");
			Employee emp8 = new Employee("df","System Admin",43000,"Pune");
			
			Predicate<Employee> p1 =emp->emp.des.equals("Manager");
			Predicate<Employee> p2 =emp->emp.sal>30000;
			Predicate<Employee> p3 =emp->emp.name.equals("asd");
			ArrayList<Employee> list=new ArrayList<Employee>();
			list.add(emp1);
			list.add(emp2);
			list.add(emp3);
			list.add(emp4);
			list.add(emp5);
			list.add(emp6);
			list.add(emp7);
			list.add(emp8);
			Display(p1.and(p2),list);
			/*if(emp1.equals(emp2)) {
				System.out.println("Equal");
				
			}
			else {
				System.out.println("Not equal");
			}*/
	}
	public static void Display(Predicate<Employee> p,ArrayList<Employee> list) {
			for (Employee e:list) {
				if(p.test(e)) {
					System.out.println(e);
				}
			}
	}

	



}
