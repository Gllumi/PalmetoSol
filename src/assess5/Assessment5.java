package assess5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assessment5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		try{
			Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter name of emp");
		String s =sc.next();
		System.out.println("Enter ID");
		int n =sc.nextInt();
		System.out.println("Enter Dept");
		String s1 = sc.next();
		System.out.println("Enter Designation");
		String s2= sc.next();
		System.out.println("Enter Company name");
		String s3 =sc.next();
		System.out.println("Enter E-mail");
		String s4 = sc.next();
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		String query = ("insert into employee values(?,?,?,?,?,?)");
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, s);
		pst.setInt(2, n);
		pst.setString(3, s1);
		pst.setString(4, s2);
		pst.setString(5, s3);
		pst.setString(6, s4);
		int x = pst.executeUpdate();
		
		}
		catch(Exception e) {
			
		}
	}

}
