package test;

import java.util.function.Predicate;

public class User {
	String uid;
	String pwd;
	public User(String uid,String pwd) {
		super();
		this.uid=uid;
		this.pwd=pwd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1= new User("admin","1234");
		User u2= new User("aasd","0234");
		Predicate<User> tuser= u->u.uid.equals("admin")&&u.pwd.equals("1234");
		if(tuser.test(u2)) {
			System.out.println("Valid");
			
		}
		else {
			System.out.println("Invalid");
		}
	}
	
		
	

}
