package cts9;
import java.sql.*;
public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement = connection.createStatement();
		//String query = "create table test (id Int(5), name Varchar(20))";
		String query = "insert into customer values(1003, 'Jain','Silver',22)";
		//String query = "delete from customer where cus_id=1003";
		statement.executeUpdate(query);
		//int count = statement.executeUpdate(query);
		//boolean flag = statement.execute(query);
		//if(flag)
		//	System.out.println("ResultSet is returned...");
		//else
			//System.out.println("Record(s) inserted ...");
			System.out.println("Record deleted...");
		statement.close();
		connection.close();
		
	
	}
}
