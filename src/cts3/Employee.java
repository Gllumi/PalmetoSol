package cts3;

public class Employee {
	
	
		long employeeId;
		String employeeName;
		String employeeAddress;
		long employeePhone;
		double basicSalary;
		double specialAllowance=250.80;
		double HRA = 1000.50;
		

	
	
	Employee(long Id,String Name,String address,long Phone){
		Id = employeeId;
		Name = employeeName;
		address = employeeAddress;
		Phone = employeePhone;
	}
	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary* specialAllowance/100)+ (basicSalary* HRA/100);
	    System.out.println(salary);
	}

}
class Manager extends Employee{

	Manager(long Id, String Name, String address, long Phone,double salary) {
		super(Id, Name, address, Phone);
		// TODO Auto-generated constructor stub
	}
	
}
class Trainee extends Employee{

	Trainee(long Id, String Name, String address, long Phone, double salary) {
		super(Id, Name, address, Phone);
		// TODO Auto-generated constructor stub
	}
	
}
