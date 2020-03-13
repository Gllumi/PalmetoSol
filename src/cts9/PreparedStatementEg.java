package cts9;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/cts","root","root");
			Scanner sc = new Scanner(System.in);
			int cus_id = sc.nextInt();
			String query = "select * from customer where id=" ;
			//String query = "insert into customer values(?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(query);
			
			/*String cus_name = sc.next();
			String acc_type = sc.next();
			int age = sc.nextInt();*/
			pst.setInt(1, cus_id);
			ResultSet rs = pst.executeQuery(query);
			
			
			/*pst.setString(2, cus_name);
			pst.setString(3, acc_type);
			pst.setInt(4, age);*/
			//int x = pst.executeUpdate();
			while(rs.next()) 
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			rs.close();
			//System.out.println(x+" Record Inserted...");
		}
		catch(Exception e) {
			
		}
		
	}

}
