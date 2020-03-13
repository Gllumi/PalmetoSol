package cts9;
import java.sql.*;
public class MetaDataEg {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/cts","root","root");
			
			
			
			DatabaseMetaData dmd = connection.getMetaData();
			System.out.println("Database Name:"+dmd.getDatabaseProductName());
			System.out.println("Database Version: " +dmd.getDatabaseProductVersion());
			System.out.println("Name of Driver: " +dmd.getDriverName());
			System.out.println("Driver Version: " +dmd.getDriverVersion());
			System.out.println("Driver Major Version: " +dmd.getDriverMajorVersion());
			
			
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Number of Columns : "+ rsmd.getColumnCount());
			//for(int i=0)
		}
		catch(Exception e) {}
	}
}
